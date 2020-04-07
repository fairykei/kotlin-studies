package com.example.avaliaraluno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resultado.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // este código sempre será executado antes da tela abrir
        // no caso, ele vai alterar o que está escrito no componente
        // de id "tvInicio" no XML

        val nome = etNome.text
        val nota1 = etNota1.inputType
        val nota2 = etNota2.inputType

        val mensagem = ""
        val imagem1 = "@drawable/imagem1"
        val imagem2 = "@drawable/imagem2"
    }

    fun irTela2(v: View) {
        // colocar essa função no onclick do botão no xml de layout
        val resultado = Intent(this, Resultado::class.java) // cria um intent mas nao realiza a ação

        val nome = intent.extras!!.getString("nome")
        val nota1 = intent.extras!!.getFloat("nota1")
        val nota2 = intent.extras?.getFloat("nota2")

        if (nota1+nota2?.div(2)!! >= 6) {
            tvTexto.text = "Parabéns, NOME! Aprovado!"
            ivImagem.setImageDrawable(`drawable-mdpi`)
        } else {
            tvTexto.text = "${nome}, infelizmente, reprovado"
        }

        startActivity(resultado) // realiza a ação desejada
        setContentView(R.layout.activity_main)
    }

    //fun cliqueLoko(v: View) {
    // tvInicio.text = "E num é que clicou? :O"
    //  tvInvejoso.text = tvInicio.text
    //}

    fun sairApp(v: View) {
        finishAffinity()
    }

    fun sair(v: View) {
        finish()
    }
}
