package com.example.ejercicio_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup miGrupo = (RadioGroup) findViewById(R.id.radioGroup);
        miGrupo.clearCheck();
        miGrupo.check(R.id.radioButton);
        int idMarcdo = miGrupo.getCheckedRadioButtonId();

        miGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                RadioButton rb = (RadioButton) findViewById(checkedId);
                TextView Tvw = (TextView) findViewById(R.id.Texto);
                Tvw.setText("PULSADO " + rb.getText());



            }
        });
    }
}