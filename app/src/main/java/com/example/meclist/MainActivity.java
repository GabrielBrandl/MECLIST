    package com.example.meclist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button acessar; 

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acessar = (Button) findViewById(R.id.button_tela_entrar_entrar);

        acessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivities(new Intent[]{new Intent(MainActivity.this, TelaEntrar.class)});
            }
        });
    }
};