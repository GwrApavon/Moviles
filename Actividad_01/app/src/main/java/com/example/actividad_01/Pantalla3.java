package com.example.actividad_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Pantalla3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
        TextView miTexto = (TextView) findViewById(R.id.textView3);

        miTexto.append(HtmlCompat.fromHtml(
                "<br><p style=\"color:Blue\"; \"text-size:20dp\";>" +
                        "<i>Texto añadido con Append desde java.</p></i>",
                        HtmlCompat.FROM_HTML_MODE_LEGACY));

    }
}