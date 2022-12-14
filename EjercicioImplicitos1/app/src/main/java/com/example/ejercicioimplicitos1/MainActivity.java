package com.example.ejercicioimplicitos1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("EJEMPLO", "Estoy en onCreate");
        Button btn = (Button) findViewById(R.id.destruir);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        finish();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.i("EJEMPLO", "Estoy en onDestroy");
        Intent ej1 = new Intent(Intent.ACTION_VIEW);
        ej1.setClass(this,MainActivity2.class);
        String clave = "Hola";
        ej1.putExtra(Intent.EXTRA_TEXT, clave);
        startActivity(ej1);

    }
}