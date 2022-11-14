package com.example.listas_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listado = (ListView) findViewById(R.id.Lista);
        final String[] datos = new String[] {"España", "Alemania", "Francia", "Rusia", "EEUU", "Ucrania", "Australia", "Japón", "Noruega", "China"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        listado.setAdapter(adaptador);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id) {
                TextView miTexto = findViewById(R.id.txtListas);
                miTexto.setText(datos [posicion]);
                miTexto.setTextSize(20);
                
            }
        });

    }
}