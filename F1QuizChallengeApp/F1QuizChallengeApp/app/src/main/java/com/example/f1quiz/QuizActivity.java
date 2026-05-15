package com.example.f1quiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class QuizActivity extends AppCompatActivity {

    private TextView questionText;
    private TextView scoreText;

    private Button option1Button;
    private Button option2Button;
    private Button option3Button;
    private Button option4Button;

    private Button restartButton;
    private Button homeButton;

    private ArrayList<Question> questions;

    private int currentQuestionIndex = 0;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionText = findViewById(R.id.questionText);
        scoreText = findViewById(R.id.scoreText);

        option1Button = findViewById(R.id.option1Button);
        option2Button = findViewById(R.id.option2Button);
        option3Button = findViewById(R.id.option3Button);
        option4Button = findViewById(R.id.option4Button);

        restartButton = findViewById(R.id.restartButton);
        homeButton = findViewById(R.id.homeButton);

        String category = getIntent().getStringExtra("category");

        if (category != null) {
            switch (category) {
                case "drivers":
                    questions = QuizData.getDriverQuestions();
                    break;

                case "teams":
                    questions = QuizData.getTeamQuestions();
                    break;

                case "circuits":
                    questions = QuizData.getCircuitQuestions();
                    break;

                default:
                    questions = QuizData.getDriverQuestions();
                    break;
            }
        } else {
            questions = QuizData.getDriverQuestions();
        }

        Collections.shuffle(questions);

        showQuestion();

        option1Button.setOnClickListener(v -> checkAnswer(0));
        option2Button.setOnClickListener(v -> checkAnswer(1));
        option3Button.setOnClickListener(v -> checkAnswer(2));
        option4Button.setOnClickListener(v -> checkAnswer(3));

        restartButton.setOnClickListener(v -> restartQuiz());

        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(QuizActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }

    private void showQuestion() {

        if (currentQuestionIndex >= questions.size()) {

            saveHighScore();

            Toast.makeText(this,
                    "Quiz Finished! Final Score: " + score,
                    Toast.LENGTH_LONG).show();

            return;
        }

        Question currentQuestion = questions.get(currentQuestionIndex);

        questionText.setText(currentQuestion.getQuestionText());

        String[] options = currentQuestion.getOptions();

        option1Button.setText(options[0]);
        option2Button.setText(options[1]);
        option3Button.setText(options[2]);
        option4Button.setText(options[3]);

        scoreText.setText("Score: " + score);
    }

    private void checkAnswer(int selectedIndex) {

        Question currentQuestion = questions.get(currentQuestionIndex);

        if (selectedIndex == currentQuestion.getCorrectIndex()) {

            score++;

            Toast.makeText(this,
                    "Correct!",
                    Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(this,
                    "Wrong Answer!",
                    Toast.LENGTH_SHORT).show();
        }

        currentQuestionIndex++;

        showQuestion();
    }

    private void restartQuiz() {

        currentQuestionIndex = 0;
        score = 0;

        Collections.shuffle(questions);

        showQuestion();

        Toast.makeText(this,
                "Quiz Restarted",
                Toast.LENGTH_SHORT).show();
    }

    private void saveHighScore() {

        SharedPreferences preferences =
                getSharedPreferences("F1QuizPrefs", MODE_PRIVATE);

        int highScore = preferences.getInt("highScore", 0);

        if (score > highScore) {

            SharedPreferences.Editor editor = preferences.edit();

            editor.putInt("highScore", score);

            editor.apply();

            Toast.makeText(this,
                    "New High Score!",
                    Toast.LENGTH_SHORT).show();
        }
    }
}