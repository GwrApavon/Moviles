package com.example.actividad_01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Pantalla4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_04);

        TextView miText = (TextView) findViewById(R.id.textView4);
        Typeface miFuente = Typeface.createFromAsset(getAssets(),"Umbrella.ttf");
        miText.setTypeface(miFuente);
        miText.setTextSize(30);
        miText.setTextColor(Color.RED);
    }


}