package com.example.meclist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInserirCodigo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button voltar_inserir;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inserir_codigo);

        voltar_inserir = (Button) findViewById(R.id.button_voltar_esqueci_senha);

        voltar_inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(TelaInserirCodigo.this, EsqueciSenha.class)});
            }
        });
    }
}