package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void abrirIndicaciones (View view){
        Intent intent = new Intent(this, Activity_Indicaciones.class);
        startActivity(intent);
    }

    public  void abrirCalculadora (View view){
        Intent intent = new Intent(this, ActivityCalculadora.class);
        startActivity(intent);
    }
}