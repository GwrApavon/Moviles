package com.example.listas_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner listado = (Spinner) findViewById(R.id.spinner);
        final String[] datos = new String[] {"España", "Alemania", "Francia", "Rusia", "EEUU", "Ucrania", "Australia", "Japón", "Noruega", "China"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        listado.setAdapter(adaptador);
        TextView miTexto = findViewById(R.id.txtSpinner);
        listado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                miTexto.setText(datos [i]);
                miTexto.setTextSize(20);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                miTexto.setText("No hay nada seleccionado");
                miTexto.setTextSize(20);
            }
        });

    }
}