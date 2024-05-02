package com.example.meclist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EsqueciSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button voltar;
        Button enviar;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);

        voltar = (Button) findViewById(R.id.button_voltar_tela_entrar);
        enviar = (Button) findViewById(R.id.button_tela_entrar_enviar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(EsqueciSenha.this, TelaEntrar.class)});
            }
        });


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(EsqueciSenha.this, TelaInserirCodigo.class)});
            }
        });

    }
}