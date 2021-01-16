package com.jose.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var Respuesta: TextView? = null
    private var num1: EditText? = null
    private var num2: EditText? = null
    private var Sum: Button? = null
    private var rest: Button? = null
    private val mult: Button? = null
    private var div: Button? = null

    /*  private String numero1 = "";
    private String numero2 = "";*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Respuesta = findViewById(R.id.respuesta)
        num1 = findViewById(R.id.numero1)
        num2 = findViewById(R.id.numro2)
        Sum = findViewById(R.id.suma)
        rest = findViewById(R.id.resta)
        div = findViewById(R.id.division)
    }

    fun suma(view: View?) {
        //Toast.makeText(this, "Presionaste el boton de suma", Toast.LENGTH_SHORT).show();
        val total = num1!!.text.toString().toInt() + num2!!.text.toString().toInt()
        Respuesta!!.text = total.toString() + ""
    }

    fun Rests(view: View?) {
        //   Toast.makeText(this, "Presionaste el botn de resta", Toast.LENGTH_SHORT).show();
        val total = num1!!.text.toString().toInt() - num2!!.text.toString().toInt()
        Respuesta!!.text = total.toString() + ""
    }

    fun multi(view: View?) {
        //   Toast.makeText(this, "Presionaste el boton d multiplicacion", Toast.LENGTH_SHORT).show();
        val total = num1!!.text.toString().toInt() * num2!!.text.toString().toInt()
        Respuesta!!.text = total.toString() + ""
    }

    operator fun div(view: View?) {
        //     Toast.makeText(this, "Presionaste el boton de division", Toast.LENGTH_SHORT).show();
        val total = num1!!.text.toString().toInt() / num2!!.text.toString().toInt()
        Respuesta!!.text = total.toString() + ""
    }

    fun clear(view: View?) {
        Respuesta!!.text = ""
        num1!!.setText("")
        num1!!.setText("")
    }
}