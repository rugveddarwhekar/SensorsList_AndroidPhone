package com.example.comp528project3sensorslist;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class LinearAcceleration extends AppCompatActivity implements SensorEventListener {

    float x_min, y_min, z_min = 10000;
    float x_max, y_max, z_max = -9999;
    Sensor linearAcc;
    SensorManager mySensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_acceleration);

        mySensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        linearAcc = mySensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        mySensorManager.registerListener(LinearAcceleration.this, linearAcc, mySensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_LINEAR_ACCELERATION) {
            //Log.d(TAG, "onSensorChanged: " + x_min + x_max + z_max);
            if(sensorEvent.values[0] <= x_min){
                x_min = sensorEvent.values[0];
            }
            if(sensorEvent.values[1] <= y_min){
                y_min = sensorEvent.values[1];
            }
            if(sensorEvent.values[2] <= z_min){
                z_min = sensorEvent.values[2];
            }
            if(sensorEvent.values[0] >= x_max){
                x_max = sensorEvent.values[0];
            }
            if(sensorEvent.values[1] >= y_max){
                y_max = sensorEvent.values[1];
            }
            if(sensorEvent.values[2] >= z_max){
                z_max = sensorEvent.values[2];
            }
            TextView tv_acc_x_current = findViewById(R.id.acc_x_current);
            TextView tv_acc_y_current = findViewById(R.id.acc_y_current);
            TextView tv_acc_z_current = findViewById(R.id.acc_z_current);
            TextView tv_acc_x_min = findViewById(R.id.acc_x_min);
            TextView tv_acc_y_min = findViewById(R.id.acc_y_min);
            TextView tv_acc_z_min = findViewById(R.id.acc_z_min);
            TextView tv_acc_x_max = findViewById(R.id.acc_x_max);
            TextView tv_acc_y_max = findViewById(R.id.acc_y_max);
            TextView tv_acc_z_max = findViewById(R.id.acc_z_max);

            tv_acc_x_current.setText("X: "+ sensorEvent.values[0]);
            tv_acc_x_min.setText("X: "+ x_min);
            tv_acc_x_max.setText("X: "+ x_max);

            tv_acc_y_current.setText("Y: "+ sensorEvent.values[1]);
            tv_acc_y_min.setText("Y: "+ y_min);
            tv_acc_y_max.setText("Y: "+ y_max);

            tv_acc_z_current.setText("Z: "+ sensorEvent.values[2]);
            tv_acc_z_min.setText("Z: "+ z_min);
            tv_acc_z_max.setText("Z: "+ z_max);
            //Log.d(TAG, "onSensorChanged: Accelerometer: (in meter/second-square) " + " X: " + sensorEvent.values[0] + "| Y: " + sensorEvent.values[1] + "| Z: " + sensorEvent.values[2]);
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    protected void onResume() {
        super.onResume();
        mySensorManager.registerListener(this, linearAcc, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySensorManager.unregisterListener(this);
    }
}
