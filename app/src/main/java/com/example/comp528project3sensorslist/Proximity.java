package com.example.comp528project3sensorslist;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class Proximity extends AppCompatActivity implements SensorEventListener {
    float x_min = 10000;
    float x_max = -9999;
    Sensor proximity;
    SensorManager mySensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity);

        mySensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        proximity = mySensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        mySensorManager.registerListener(Proximity.this, proximity, mySensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_PROXIMITY) {
            if (sensorEvent.values[0] <= x_min) {
                x_min = sensorEvent.values[0];
            }
            if (sensorEvent.values[0] >= x_max) {
                x_max = sensorEvent.values[0];
            }
            TextView tv_acc_x_current = findViewById(R.id.acc_x_current);
            TextView tv_acc_x_min = findViewById(R.id.acc_x_min);
            TextView tv_acc_x_max = findViewById(R.id.acc_x_max);

            tv_acc_x_current.setText("X: " + sensorEvent.values[0]);
            tv_acc_x_min.setText("X: " + x_min);
            tv_acc_x_max.setText("X: " + x_max);

        }
    }
    @Override
    public void onAccuracyChanged (Sensor sensor,int accuracy){

    }

    protected void onResume () {
        super.onResume();
        mySensorManager.registerListener(this, proximity, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause () {
        super.onPause();
        mySensorManager.unregisterListener(this);
    }
}
