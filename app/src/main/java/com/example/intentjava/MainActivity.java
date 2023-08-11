package com.example.intentjava;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private EditText senhaaa;
    private Button botao;
    private EditText nomeee;
    private Button cadastro;
    private int senhaa = 33;
    String value;
    int finalValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao = findViewById(R.id.button);
        cadastro = findViewById(R.id.cadastro);


        senhaaa = findViewById(R.id.senhaaa);
        nomeee = findViewById(R.id.nomeee);


        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                value = senhaaa.getText().toString();
                if (value.length() != 0) {
                    finalValue = Integer.parseInt(value);
                    if (finalValue == senhaa) {
                        Intent intent = new Intent(MainActivity.this, login.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(MainActivity.this, "Senha Incorreta", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Digite a senha", Toast.LENGTH_SHORT).show();

                }
            }
        });
        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });

        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDialog();
            }
        });


    }
    public void displayDialog(){
        Dialog dialog = new Diadlog(MainActivity.this);
        dialog.setContentView(R.layout.cadastro);
        dialog.show();



    }

}