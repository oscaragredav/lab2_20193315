package com.example.calculadora;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityCalculadora extends AppCompatActivity {

    TextView fila2;
    TextView fila1;
    Double n1 = 0.0;
    Double n2 = 0.0;

    String operador= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

    fila2= findViewById(R.id.textViewResultados);
    fila1= findViewById(R.id.textViewOperadores);

    }
    public void Uno(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("1");
        }else {
            fila2.setText(fila2.getText()+"1");
        }
    }public void Dos(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("2");
        }else {
            fila2.setText(fila2.getText()+"2");
        }
    }public void Tres(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("3");
        }else {
            fila2.setText(fila2.getText()+"3");
        }
    }
    public void Cuatro(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("4");
        }else {
            fila2.setText(fila2.getText()+"4");
        }
    }public void Cinco(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("5");
        }else {
            fila2.setText(fila2.getText()+"5");
        }
    }public void Seis(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("6");
        }else {
            fila2.setText(fila2.getText()+"6");
        }
    }
    public void Siete(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("7");
        }else {
            fila2.setText(fila2.getText()+"7");
        }
    }public void Ocho(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("8");
        }else {
            fila2.setText(fila2.getText()+"8");
        }
    }public void Nueve(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("9");
        }else {
            fila2.setText(fila2.getText()+"9");
        }
//        String f2=fila2.getText().toString();
//        String f1=fila1.getText().toString();
//        String logMsg = "n1="+n1+" n2="+n2+" fila1="+f1+" fila2="+f2;
//        Log.i("ASD", logMsg);
    }public void Cero(View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        if(n1 == 0.0){
            fila2.setText("0");
        }else {
            fila2.setText(fila2.getText()+"0");
        }
    }

    public void Suma (View view){
        n2 = Double.parseDouble(fila2.getText().toString());
        n1=0.0;
        operador = "+";
        fila1.setText(fila2.getText()+"+");
        fila2.setText("0");
    }public void Resta (View view){
        n2 = Double.parseDouble(fila2.getText().toString());
        n1=0.0;
        operador = "-";
        fila1.setText(fila2.getText()+"-");
        fila2.setText("0");
    }public void Multiplicacion (View view){
        n2 = Double.parseDouble(fila2.getText().toString());
        n1=0.0;
        operador = "*";
        fila1.setText(fila2.getText()+"*");
        fila2.setText("0");
    }public void Division (View view){
        n2 = Double.parseDouble(fila2.getText().toString());
        n1=0.0;
        operador = "/";
        fila1.setText(fila2.getText()+"/");
        fila2.setText("0");
    }
    
    public void Equals (View view){
        n1 = Double.parseDouble(fila2.getText().toString());
        Double res=0.0;
        if(operador.equals("+")){
            res=n2+n1;
        }else if (operador.equals("-")) {
            res=n2-n1;
        }else if (operador.equals("*")) {
            res=n2*n1;
        }else if (operador.equals("/")) {
            res=n2/n1;
        }
        fila1.setText(fila2.getText());
        fila2.setText(Double.toString(res));
    }

    public void Clear (View view){
        fila1.setText("0");
        fila2.setText("0");
        n1=0.0;
        n2=0.0;
        operador="";
    }

}