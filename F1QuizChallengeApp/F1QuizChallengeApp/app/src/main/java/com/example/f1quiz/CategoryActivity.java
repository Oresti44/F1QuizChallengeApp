package com.example.f1quiz;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b); setContentView(R.layout.activity_category);
        findViewById(R.id.driverBtn).setOnClickListener(v -> openQuiz("drivers"));
        findViewById(R.id.teamBtn).setOnClickListener(v -> openQuiz("teams"));
        findViewById(R.id.circuitBtn).setOnClickListener(v -> startActivity(new Intent(this, CircuitActivity.class)));
    }
    private void openQuiz(String type) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra("quizType", type);
        startActivity(intent);
    }
}
