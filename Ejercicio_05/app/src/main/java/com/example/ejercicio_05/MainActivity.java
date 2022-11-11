package com.example.ejercicio_05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch pulsador = findViewById(R.id.switch1);
        pulsador.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean pulsado) {
                if(pulsado){
                    pulsador.setText("Pulsado");
                }
                else{
                    pulsador.setText("No pulsado");
                }
            }
        });
    }
}