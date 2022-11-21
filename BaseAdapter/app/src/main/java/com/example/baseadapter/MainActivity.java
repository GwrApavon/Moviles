package com.example.baseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Datos> datos = new ArrayList<Datos>();
        datos.add(new Datos("marc.jpg", "Marc Scale Up","Un chaval trabajador donde lo haya",false));
        datos.add(new Datos("sophia.jpg","Sophia Scale Up", "Muy maja la chavala",false));
        datos.add(new Datos("sophia2.jpg","Sophia Scale Up", "Un poco borde pero guay",false));
        datos.add(new Datos("Paul.jpg","Paul Scale Up", "Muy subidito, no me acercaría",false));

        //Context contexto = new Context();
        //Adaptador apt = new Adaptador(Context contexto, datos);
    }
}




