package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // recuperar os componentos EditText
           // Criar uma variavél e associar(=) o componente de UI<TextInputEditText>
        // recuperar o botao da tela
        // colocar ação do botão setOnClickListener
        // Recuperar o texto digitado no edtpeso

        val edtpeso = findViewById<TextInputEditText>(R.id.edtpeso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edtaltura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edtaltura.text

            println("Bruno acão do botão " + altura)

        }


    }
}