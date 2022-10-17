package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private boolean presionar;

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presionar = false;
    }



    public void presionaBoton1(View view) {
        Intent act2 = new Intent(this,MainActivity2.class);
        Button boton = (Button) view;

        if(presionar)
        {
            startActivity(act2);
            Log.i("CActividad", "He pasado a la actividad 2");
        }
        presionar = !presionar;

    }

    public void presionaBoton2(View view) {
        Intent act3 = new Intent(this,MainActivity3.class);
        Button boton1 = (Button) view;

        if(presionar)
        {
            startActivity(act3);
            Log.i("CActividad", "He pasado a la actividad 3");
        }
        presionar = !presionar;


    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CActividad", "Estoy Parada (a1)");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CActividad", "Me han vuelto a activar (a1)");
        super.onPause();
    }
}