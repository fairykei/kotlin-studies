package com.example.avaliaraluno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*

class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nome = intent.extras?.getString("nomes")
        val nota01 = intent.extras?.getFloat("nota1")
        val nota02 = intent.extras?.getFloat("nota2")


        val media = (nota01!! + nota02!!)?.div(2)

        if (media!! >= 6) {
            tvTexto.text = "Parabéns, ${nome}! Aprovado!"
            ivImagem.setImageResource(R.drawable.imagem1)
        } else {
            tvTexto.text = "${nome}, infelizmente, reprovado"
            ivImagem.setImageResource(R.drawable.imagem2)
        }
    }

}