package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSumar(view: View) {
             // consiguiendo los dos valores q ingreso el usuario
        var editTextNumero1:EditText= findViewById(R.id.editTextNumero1)
        var editTextNumero2:EditText= findViewById(R.id.editTextNumero2)
            // aqui tenemos los valores ya escrito el usuario
        var numero1 = Integer.parseInt(editTextNumero1.text.toString())
        var numero2 = Integer.parseInt(editTextNumero2.text.toString())

               // sumamos los dos Numeros
        var resultado = numero1 + numero2

        // escribimos el resultado dentro textview
        var textViewResultado: TextView= findViewById(R.id.textViewResultado)

        // escribir dentro de la propiedad text el vavor de Resultado
        textViewResultado.text= resultado.toString()

    }

    fun onMultiplicar(view: View) {


        var editTextNumero1: EditText= findViewById(R.id.editTextNumero1)
        var editTextNumero2: EditText= findViewById(R.id.editTextNumero2)

        var numero1=Integer.parseInt(editTextNumero1.text.toString())
        var numero2=Integer.parseInt(editTextNumero2.text.toString())

        var resultado= numero1 * numero2

        var textViewResultado: TextView= findViewById(R.id.textViewResultado)

        textViewResultado.text= resultado.toString()

    }


    fun onDividir(view: View) {
        var editTextNumero1: EditText= findViewById(R.id.editTextNumero1)
        var editTextNumero2: EditText= findViewById(R.id.editTextNumero2)

        var numero1=Integer.parseInt(editTextNumero1.text.toString())
        var numero2=Integer.parseInt(editTextNumero2.text.toString())

        var resultado= numero1 % numero2

        var textViewResultado: TextView= findViewById(R.id.textViewResultado)

        textViewResultado.text= resultado.toString()

    }
    fun onRestar(view: View) {
        var editTextNumero1: EditText= findViewById(R.id.editTextNumero1)
        var editTextNumero2: EditText= findViewById(R.id.editTextNumero2)

        var numero1=Integer.parseInt(editTextNumero1.text.toString())
        var numero2=Integer.parseInt(editTextNumero2.text.toString())

        var resultado= numero1 - numero2

        var textViewResultado: TextView= findViewById(R.id.textViewResultado)

        textViewResultado.text= resultado.toString()
    }

}