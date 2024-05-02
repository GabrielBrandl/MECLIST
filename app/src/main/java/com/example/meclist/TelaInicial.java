package com.example.meclist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button voltar;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        voltar = (Button) findViewById(R.id.button_voltar_mainact);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(TelaInicial.this, TelaEntrar.class)});
            }
        });

    }
}