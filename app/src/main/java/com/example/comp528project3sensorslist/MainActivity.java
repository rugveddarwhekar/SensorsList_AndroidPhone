package com.example.comp528project3sensorslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.hardware.Sensor.TYPE_ALL;

public class MainActivity extends AppCompatActivity {

    SensorManager mySensorManager;
    //Sensor accelerometer;
//    Sensor accelerometer;
    Sensor magnetic;
    Sensor proximity;
    Sensor ambientLight;
    Sensor gyroscope;
    Sensor linearAcceleration;
    Sensor gravity;
//    Sensor geomagneticRotation;
//    Sensor rotationVector;
//    Sensor orientation;
//    Sensor gameRotation;
    Sensor barometer;
//    Sensor temprature;
//    Sensor stepCounter;

//    private static final String TAG = "MainActivity";

//    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mySensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

//        temprature = mySensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
//        accelerometer = mySensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
//        magnetic = mySensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
//        proximity = mySensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
//        ambientLight = mySensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
//        gyroscope = mySensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
//        linearAcceleration = mySensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
//        gravity = mySensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY);
//        geomagneticRotation = mySensorManager.getDefaultSensor(Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR);
//        rotationVector = mySensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
//        orientation = mySensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION);
//        gameRotation = mySensorManager.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR);
//        barometer = mySensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
//        stepCounter = mySensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);

//       mySensorManager.registerListener(MainActivity.this, temprature, mySensorManager.SENSOR_DELAY_FASTEST);
//        mySensorManager.registerListener(MainActivity.this, accelerometer, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, proximity, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, ambientLight, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, gyroscope, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, linearAcceleration, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, gravity, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, barometer, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, orientation, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, rotationVector, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, geomagneticRotation, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, gameRotation, mySensorManager.SENSOR_DELAY_NORMAL);
//        mySensorManager.registerListener(MainActivity.this, stepCounter, mySensorManager.SENSOR_DELAY_NORMAL);


        //List deviceSensors = mySensorManager.getSensorList(TYPE_ALL);
//        List<Sensor> mySensorList = mySensorManager.getSensorList(TYPE_ALL);


//        listview = findViewById(R.id.listView);
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        //String sSensList = new String("");
//        Sensor tmp;
//        int i;
//        for (i = 0; i < mySensorList.size(); i++) {
//            tmp = mySensorList.get(i);
//            // sSensList = " "+sSensList+tmp.getName(); // Add the sensor name to the string of sensors available
//            arrayList.add(tmp.getName());
//        }

        //mySensorManager.registerListener(MainActivity.this, accelerometer, mySensorManager.SENSOR_DELAY_NORMAL);

        // Log.d(TAG, "onCreate: String " + sSensList);


//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
//        listview.setAdapter(arrayAdapter);
    }

    public void accClicked (View view){
        Intent intent = new Intent(this, Accelerometer.class);
        startActivity(intent);
    }

    public void linearaccClicked (View view){
        Intent intent = new Intent(this, LinearAcceleration.class);
        startActivity(intent);
    }

    public void gravityClicked (View view){
        Intent intent = new Intent(this, Gravity.class);
        startActivity(intent);
    }

    public void gyroClicked (View view){
        Intent intent = new Intent(this, Gyroscope.class);
        startActivity(intent);
    }

    public void lightClicked (View view){
        Intent intent = new Intent(this, Light.class);
        startActivity(intent);
    }

    public void magnetClicked (View view){
        Intent intent = new Intent(this, Magnet.class);
        startActivity(intent);
    }

    public void proximityClicked (View view){
        Intent intent = new Intent(this, Proximity.class);
        startActivity(intent);
    }

    public void pressureClicked (View view){
        Intent intent = new Intent(this, Pressure.class);
        startActivity(intent);
    }

    public void tempClicked (View view){
        Intent intent = new Intent(this, Temperature.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //mySensorManager.registerListener(this, temprature, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //mySensorManager.unregisterListener(this);
    }

//    @Override
//    public void onSensorChanged(SensorEvent sensorEvent) {
//        Log.d(TAG, "onSensorChanged: " + (sensorEvent.values[0]));
//        Log.d(TAG, "onSensorChanged: Temprature: " + sensorEvent.values[0]);
//        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
//            Log.d(TAG, "onSensorChanged: Accelerometer: (in meter/second-square) " + " X: " + sensorEvent.values[0] + "| Y: " + sensorEvent.values[1] + "| Z: " + sensorEvent.values[2]);
//        }
//        if (sensorEvent.sensor.getType() == Sensor.TYPE_LINEAR_ACCELERATION) {
//            Log.d(TAG, "onSensorChanged: Linear Acceleration: (in meter/second-square) " + " X: " + sensorEvent.values[0] + "| Y: " + sensorEvent.values[1] + "| Z: " + sensorEvent.values[2]);
//        }
//        if (sensorEvent.sensor.getType() == Sensor.TYPE_GRAVITY) {
//            Log.d(TAG, "onSensorChanged: Gravity: (in meter/second-square) " + " X: " + sensorEvent.values[0] + "| Y: " + sensorEvent.values[1] + "| Z: " + sensorEvent.values[2]);
//        }
//        if (sensorEvent.sensor.getType() == Sensor.TYPE_GYROSCOPE) {
//            Log.d(TAG, "onSensorChanged: Gyroscope: (in microTesla) "+ " X: "+ sensorEvent.values[0] + "| Y: " + sensorEvent.values[1] + "| Z: " + sensorEvent.values[2]);
//        }
//        if (sensorEvent.sensor.getType() == Sensor.TYPE_LIGHT) {
//            Log.d(TAG, "onSensorChanged: Light: (in lux) "+ sensorEvent.values[0]);
//        }
//        if (sensorEvent.sensor.getType() == Sensor.TYPE_PRESSURE) {
//            Log.d(TAG, "onSensorChanged: Pressure: (in hectopascal) " + sensorEvent.values[0]);
//        }
//        if (sensorEvent.sensor.getType() == Sensor.TYPE_PROXIMITY) {
//            Log.d(TAG, "onSensorChanged: Proximity: (in centimeter) " + sensorEvent.values[0]);
//        }
//        if (sensorEvent.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD) {
//            Log.d(TAG, "onSensorChanged: Magnetic Field: (in meter/second-square) " + " X: " + sensorEvent.values[0] + "| Y: " + sensorEvent.values[1] + "| Z: " + sensorEvent.values[2]);
//        }
//        if (sensorEvent.sensor.getType() == Sensor.TYPE_AMBIENT_TEMPERATURE) {
//            Log.d(TAG, "onSensorChanged: Temprature: (in Celsius)" + " X: " + sensorEvent.values[0]);
//        }
        /*
        if (sensorEvent.sensor.getType() == Sensor.TYPE_GAME_ROTATION_VECTOR) {
            Log.d(TAG, "onSensorChanged: Game Rotation Vector: (in meter/second-square) " + " X: " + sensorEvent.values[0] + "| Y: " + sensorEvent.values[1] + "| Z: " + sensorEvent.values[2]);
        }
        if (sensorEvent.sensor.getType() == Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR) {
            Log.d(TAG, "onSensorChanged: Geomagnetic Rotation Vector: (in meter/second-square) " + " X: " + sensorEvent.values[0] + "| Y: " + sensorEvent.values[1] + "| Z: " + sensorEvent.values[2]);
        }
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ROTATION_VECTOR) {
            Log.d(TAG, "onSensorChanged: Rotation Vector: (in meter/second-square) " + " X: " + sensorEvent.values[0] + "| Y: " + sensorEvent.values[1] + "| Z: " + sensorEvent.values[2] + "| Scalar Component: " + sensorEvent.values[3]);
        }
        if (sensorEvent.sensor.getType() == Sensor.TYPE_STEP_COUNTER) {
            Log.d(TAG, "onSensorChanged: Step Counter: (in number of steps) "+ sensorEvent.values[0]);
//        }*/
//    }
//
//    @Override
//    public void onAccuracyChanged (Sensor sensor, int i){
//
//    }
}


/*

-------------------------------
34-43:

//      mySensorManager.getSensorList(TYPE_ALL);

//        List deviceSensors = mySensorManager.getSensorList(Sensor.TYPE_ALL);
//        Log.v("Total sensors",""+deviceSensors.size);
//        deviceSensors.forEach{
//            Log.v("Sensor name",""+it)
//        }

        //Log.d(TAG, "onCreate: Sensor List - " + mySensorManager.getSensorList(TYPE_ALL));

-------------------------------

53-69


//        for (int i = 0; i < deviceSensors.size(); i++){
//            arrayList.add("Sensor: "+ deviceSensors.iterator());
//        }

//        arrayList.add("Hello!");
//        arrayList.add("I");
//        arrayList.add("Love");
//        arrayList.add("Android!");
//        arrayList.add("Hello!");
//        arrayList.add("I");
//        arrayList.add("Love");
//        arrayList.add("Android!");
//        arrayList.add("Hello!");
//        arrayList.add("I");
//        arrayList.add("Love");
//        arrayList.add("Android!");

-------------------------------

 */