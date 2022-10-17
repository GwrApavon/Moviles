package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private boolean presionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        presionar = false;
    }

    public void presionaBoton3(View view) {
        Intent act3 = new Intent(this,MainActivity3.class);
        Button boton = (Button) view;

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
        Log.i("CActividad", "Estoy Parada(a2)");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CActividad", "Me han vuelto a activar (a2)");
        super.onPause();
    }
}