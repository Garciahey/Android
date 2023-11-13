package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

       fun onSumar(view: View) {
        var editTextNumero1: EditText = findViewById(R.id.editTextNumero1);
        var editTextNumero2: EditText = findViewById(R.id.editTextNumero2);

        var numero1 =Integer.parseInt(editTextNumero1.text.toString());
        var numero2 =Integer.parseInt(editTextNumero2.text.toString());

        var resultado = numero1 + numero2;

        var textViewResultado: TextView= findViewById(R.id.textViewResultado);

        textViewResultado.text= resultado.toString();

    }





}