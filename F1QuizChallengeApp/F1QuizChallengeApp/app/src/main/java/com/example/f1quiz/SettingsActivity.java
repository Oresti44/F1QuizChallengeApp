package com.example.f1quiz;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle b) {
        super.onCreate(b); setContentView(R.layout.activity_settings);
        SharedPreferences sp = getSharedPreferences("f1", MODE_PRIVATE);
        Switch s = findViewById(R.id.timerSwitch);
        s.setChecked(sp.getBoolean("timerMode", true));
        s.setOnCheckedChangeListener((button, checked) -> sp.edit().putBoolean("timerMode", checked).apply());
    }
}
