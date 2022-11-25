package com.example.baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Datos> datos = new ArrayList<Datos>();
        datos.add(new Datos(R.drawable.marc, "Marc Scale Up","Un chaval trabajador donde lo haya",false));
        datos.add(new Datos(R.drawable.sophia,"Sophia Scale Up", "Muy maja la chavala",false));
        datos.add(new Datos(R.drawable.sophia2,"Sophia2 Scale Up", "Un poco borde pero guay",false));
        datos.add(new Datos(R.drawable.paul,"Paul Scale Up", "Muy subidito, no me acercaría",false));
        datos.add(new Datos(R.drawable.marc, "Marc Scale Up","Un chaval trabajador donde lo haya",false));
        datos.add(new Datos(R.drawable.sophia,"Sophia Scale Up", "Muy maja la chavala",false));
        datos.add(new Datos(R.drawable.sophia2,"Sophia2 Scale Up", "Un poco borde pero guay",false));
        datos.add(new Datos(R.drawable.paul,"Paul Scale Up", "Muy subidito, no me acercaría",false));
        datos.add(new Datos(R.drawable.marc, "Marc Scale Up","Un chaval trabajador donde lo haya",false));
        datos.add(new Datos(R.drawable.sophia,"Sophia Scale Up", "Muy maja la chavala",false));
        datos.add(new Datos(R.drawable.sophia2,"Sophia2 Scale Up", "Un poco borde pero guay",false));
        datos.add(new Datos(R.drawable.paul,"Paul Scale Up", "Muy subidito, no me acercaría",false));

        ListView listado = (ListView) findViewById(R.id.miLista);
        Adaptador apt = new Adaptador(this, datos);
        listado.setAdapter(apt);
        View miCabecera = getLayoutInflater().inflate(R.layout.cabecera, null);
        listado.addHeaderView(miCabecera);


        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adaptador, View v, int position, long id){
                String seleccionado = ((Datos) adaptador.getItemAtPosition(position)).getTitle();
                String seleccionadodes = ((Datos) adaptador.getItemAtPosition(position)).getDescription();

                TextView texto = (TextView) findViewById(R.id.texto);
                texto.setText(seleccionado);
                texto.append("\n" + seleccionadodes );
            }
        });

    }
}




