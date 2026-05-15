package com.example.f1quiz;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LeaderboardActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b); setContentView(R.layout.activity_leaderboard);
        SharedPreferences sp = getSharedPreferences("f1", MODE_PRIVATE);
        ((TextView)findViewById(R.id.scoresText)).setText("Last score: " + sp.getInt("lastScore", 0) + "\nBest score: " + sp.getInt("bestScore", 0));
    }
}
