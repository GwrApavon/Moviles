package com.example.actividad_01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);
        TextView miTexto = (TextView) findViewById(R.id.textView2);

        miTexto.setText("Texto construido desde java. 20dp, italic y color blue");
        miTexto.setTextColor(Color.BLUE);
        miTexto.setTextSize(20);
        miTexto.setTypeface(miTexto.getTypeface(), Typeface.ITALIC);
        
    }
}