package com.example.ejerciciolog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("EJEMPLO", "Estoy en onCreate");
    }

    @Override
    protected void onStart() {

        super.onStart();

        Log.i("EJEMPLO", "Estoy en onStart");
    }

    @Override
    protected void onResume() {

        super.onResume();

        Log.i("EJEMPLO", "Estoy en onResume");
    }

    @Override
    protected void onPause() {

        super.onPause();

        Log.i("EJEMPLO", "Estoy en onPause");
    }

    @Override
    protected void onStop() {

        super.onStop();

        Log.i("EJEMPLO", "Estoy en onStop");
    }

    @Override
    protected void onRestart() {

        super.onRestart();

        Log.i("EJEMPLO", "Estoy en onRestart");
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

        Log.i("EJEMPLO", "Estoy en onDestroy");
    }
}