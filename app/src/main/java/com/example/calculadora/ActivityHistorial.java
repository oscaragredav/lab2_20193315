package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ActivityHistorial extends AppCompatActivity {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        Intent intent = getIntent();
        ArrayList arrayList = intent.getStringArrayListExtra("historial");

        texto = findViewById(R.id.textViewHistorial);
        texto.setText("");

        for(int i=0; i<arrayList.size(); i++){
            texto.setText(texto.getText() + "Resultado "+ String.valueOf(i)+ ": "+ String.valueOf(arrayList.get(i)) + "\n"  );
            Log.d ("contador", "" +  String.valueOf(arrayList.get(i)));
        }
    }



}