package com.example.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private ArrayList<Datos> datos;
    private Context contexto;
    public Adaptador (Context contexto, ArrayList<Datos> datos){
        super();
        this.contexto=contexto;
        this.datos=datos;
    }
    @Override
    public View getView(int posicion, View view, ViewGroup parent){
        LayoutInflater mostrado = LayoutInflater.from(contexto);
        View elemento = mostrado.inflate(R.layout.elemento, parent, false);
        ImageView img = (ImageView) elemento.findViewById(R.id.foto);
        String resName = "R.drawable." + datos.get(posicion).getImage();
        img.setImageResource(Integer.parseInt(resName)); ///////////////////////////
        TextView nombre = (TextView) elemento.findViewById(R.id.nombre);
        nombre.setText(datos.get(posicion).getTitle());
        TextView description = (TextView) elemento.findViewById(R.id.descripcion);
        description.setText(datos.get(posicion).getDescription());
        return elemento;
    }
    @Override
    public int getCount() {
        return datos.size();
    }
    @Override
    public Object getItem(int posicion) {
        return datos.get(posicion);
    }
    @Override
    public long getItemId(int posicion) {
        return posicion;
    }
}
