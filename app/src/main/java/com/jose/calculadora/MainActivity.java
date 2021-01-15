package com.jose.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    private TextView Respuesta;
    private EditText num1, num2;
    private Button Sum, rest, mult, div;


  /*  private String numero1 = "";
    private String numero2 = "";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Respuesta = findViewById(R.id.respuesta);
        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numro2);
        Sum = findViewById(R.id.suma);
        rest = findViewById(R.id.resta);
        div = findViewById(R.id.division);



    }


    public  void suma(View view){
        Integer total = Integer.parseInt(num1.getText().toString())+ Integer.parseInt(num2.getText().toString());
        Respuesta.setText(total+"");

    }
    public  void Rests(View view){
        Integer total = Integer.parseInt(num1.getText().toString())- Integer.parseInt(num2.getText().toString());
        Respuesta.setText(total+"");

    }
    public  void multi(View view){
        Integer total = Integer.parseInt(num1.getText().toString())* Integer.parseInt(num2.getText().toString());
        Respuesta.setText(total+"");

    }
    public  void div(View view){
        Integer total = Integer.parseInt(num1.getText().toString())/ Integer.parseInt(num2.getText().toString());
        Respuesta.setText(total+"");

    }
}