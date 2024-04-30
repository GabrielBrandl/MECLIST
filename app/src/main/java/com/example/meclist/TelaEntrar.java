package com.example.meclist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.OnNewIntentProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class TelaEntrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button voltar; // Voltar a primeira tela
        Button esqueci_senha; // Acessar a área de esquecir senha
        Button entrar_entrar; // Acessar a tela de entrar

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_entrar);

        voltar = (Button) findViewById(R.id.button_voltar_tela_entrar);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(TelaEntrar.this, MainActivity.class)});
            }
        });

        esqueci_senha = (Button) findViewById(R.id.button_esqueci_senha);

        esqueci_senha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(TelaEntrar.this, EsqueciSenha.class)});
            }
        });

    }

}