package com.example.multiplastelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        finishAffinity() // função nativa que finaliza o app
    }
}
