package com.example.avaliaraluno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // prof, meu v:View por algum motivo nao ta sendo usado, comparei codigo com meus amigos e rodei o deles aqui, com o mesmo código não funciona, não sei se é alguma configuração ou o que.. mas a logica creio que ta certa


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // este código sempre será executado antes da tela abrir
    }

    fun avaliarAluno(v:View) {
        // colocar essa função no onclick do botão no xml de layout
        val resultado = Intent(this, Resultado::class.java) // cria um intent mas nao realiza a ação

        val nomes = etNome.text.toString()
        val nota1 = etNota1.text.toString().toFloat()
        val nota2 = etNota2.text.toString().toFloat()

        resultado.putExtra("nome", nomes)
        resultado.putExtra("nota01", nota1)
        resultado.putExtra("nota02", nota2)
        startActivity(resultado) // realiza a ação desejada
    }
}
