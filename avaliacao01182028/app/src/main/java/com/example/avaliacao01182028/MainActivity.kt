package com.example.avaliacao01182028

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val prefs = getPreferences(Context.MODE_PRIVATE)
        etLogin.setText(prefs.getString("login", ""))
        etSenha.setText(prefs.getString("senha", ""))
    }

    fun validarUsuario(v: View) {
        // colocar essa função no onclick do botão no xml de layout
        val tela2 = Intent(this, Tela2::class.java) // cria um intent mas nao realiza a ação

        val login = etLogin.text.toString()
        val senha = etSenha.text.toString()

        if (login == "aidimin" && senha == "seinha") {
            val prefs = getPreferences(Context.MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putString("login", etLogin.text.toString())
            editor.putString("senha", etSenha.text.toString())
            editor.commit()

            tela2.putExtra("login", login)
            tela2.putExtra("senha", senha)
            startActivity(tela2)
        } else {
            val msg = "Falha na autenticação"
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        }
    }

}
