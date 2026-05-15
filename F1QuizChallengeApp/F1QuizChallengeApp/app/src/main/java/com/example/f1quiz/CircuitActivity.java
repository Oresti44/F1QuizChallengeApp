package com.example.f1quiz;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CircuitActivity extends AppCompatActivity implements SensorEventListener {
    private TextView clue, result, hint;
    private SensorManager sensorManager;
    private Sensor accelerometer;
    private final String answer = "monza";

    @Override protected void onCreate(Bundle b) {
        super.onCreate(b); setContentView(R.layout.activity_circuit);
        clue = findViewById(R.id.circuitClue); result = findViewById(R.id.resultText); hint = findViewById(R.id.hintText);
        clue.setText("Clue: This Italian circuit is called the Temple of Speed.");
        findViewById(R.id.checkBtn).setOnClickListener(v -> checkAnswer());
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if (accelerometer == null) hint.setText("No accelerometer found. Hint feature disabled.");
    }
    private void checkAnswer() {
        String user = ((EditText)findViewById(R.id.answerInput)).getText().toString().trim().toLowerCase();
        result.setText(user.contains(answer) ? "Correct ✅ Autodromo Nazionale Monza" : "Try again ❌");
    }
    @Override protected void onResume() { super.onResume(); if (accelerometer != null) sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_NORMAL); }
    @Override protected void onPause() { super.onPause(); if (accelerometer != null) sensorManager.unregisterListener(this); }
    @Override public void onSensorChanged(SensorEvent e) {
        float force = Math.abs(e.values[0]) + Math.abs(e.values[1]) + Math.abs(e.values[2]);
        if (force > 28) hint.setText("Shake hint: It starts with M and hosts the Italian GP.");
    }
    @Override public void onAccuracyChanged(Sensor sensor, int accuracy) {}
}
