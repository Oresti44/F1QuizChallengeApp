package com.example.f1quiz;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b); setContentView(R.layout.activity_main);
        findViewById(R.id.startBtn).setOnClickListener(v -> startActivity(new Intent(this, CategoryActivity.class)));
        findViewById(R.id.leaderBtn).setOnClickListener(v -> startActivity(new Intent(this, LeaderboardActivity.class)));
        findViewById(R.id.settingsBtn).setOnClickListener(v -> startActivity(new Intent(this, SettingsActivity.class)));
    }
}
