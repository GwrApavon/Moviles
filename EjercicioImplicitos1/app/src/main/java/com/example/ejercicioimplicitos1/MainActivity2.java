package com.example.ejercicioimplicitos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("EJEMPLO", "La actividad 2 ha sido creada");
        Intent ej1 = new Intent(Intent.ACTION_VIEW);
        Bundle b = ej1.getExtras();
    }
}