package com.example.avaliaraluno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // este código sempre será executado antes da tela abrir
        // no caso, ele vai alterar o que está escrito no componente
        // de id "tvInicio" no XML
        tvInicio.text = "Passei pela classe! @:"

        val usuario = intent.extras!!.getString("usuario")
        val idade = intent.extras!!.getInt("idade")
        val isAdmin = intent.extras?.getBoolean("isAdmin")

        val mensagem = "O usuario ${usuario} tem ${idade} anos. Administrador? ${isAdmin}"
        Toast.makeText(this, mensagem,Toast.LENGTH_LONG).show()
    }

    fun contar(v: View) {
        contadorTela2++
        tvTopoTela2.text = "Você já clicou ${contadorTela2} vezes!"
    }

    // override da fun padrao do botao voltar
    override fun onBackPressed() {
        if (contadorTela2 >= 5) {
            super.onBackPressed() // chama a fun padrao
        } else {
            tvTopoTela2.text = "Preciso de 5 toques, pls"
        }
    }

    fun sair(v:View) {
        finish()
    }

    fun irTela2(v: View) {
        // colocar essa função no onclick do botão no xml de layout
        val tela2 = Intent(this, Tela2::class.java) // cria um intent mas nao realiza a ação

        tela2.putExtra("usuario", "let")
        tela2.putExtra("idade", 20)
        tela2.putExtra("isAdmin", true)

        startActivity(tela2) // realiza a ação desejada
    }
    fun sairApp(v: View) {
        finishAffinity()
    }

    fun cliqueLoko(v: View) {
        // tvInicio.text = "E num é que clicou? :O"
        tvInvejoso.text = tvInicio.text
    }

    fun mensagemAlerta(v:View) {
        // recuperando o valor digitado numa EditText de id "etFrase"
        val frase = etFrase.text

        // (aquela mensagem pequena preta na parte de baixo da tela)
        Toast.makeText(this, frase, Toast.LENGTH_SHORT).show()
    }
}
