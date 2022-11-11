package com.example.ejercicio_02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pulsado(View view){
        TextView miTexto = (TextView) findViewById(R.id.textView);

        miTexto.setText("BOTÓN PULSADO");
        miTexto.setTextColor(Color.BLUE);
    }
}