package com.example.ejercicio_022;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miBoton1Java = (Button) findViewById(R.id.button2);
        Button miBoton2Java = (Button) findViewById(R.id.button4);
        miBoton1Java.setOnClickListener(this);
        miBoton2Java.setOnClickListener(this);
        }


    @Override
    public void onClick(View view){
        TextView miTexto = (TextView) findViewById(R.id.textView);
        switch (view.getId()){
                case R.id.button2:
                    miTexto.setText("BOTÓN 1 PULSADO");
                    miTexto.setTextColor(Color.RED);
                    break;
                case R.id.button4:
                    miTexto.setText("BOTÓN 2 PULSADO");
                    miTexto.setTextColor(Color.GREEN);
                    break;
                default:
                    break;
            }



    }

}