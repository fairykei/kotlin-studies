package com.example.dadosoffline

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getpref recupera as preferencias do app (dados offline)
        // context indica que os dados vao ser privados
        val preferencias = getPreferences(Context.MODE_PRIVATE)
        // get recupera um dado a partir do nome, argumento 1 é o nome,
        // e argumento 2 é valor padrão se nao encontrar o nome
        etNome.setText(preferencias.getString("nomeUsuario", ""))
    }

    fun salvarDados(v: View) { //associa o onclick
        val preferencias = getPreferences(Context.MODE_PRIVATE)
        // edit retorna o editor das prefs, para alterar dados offline
        val editor = preferencias.edit()
        // put cria ou altera dados offline
        editor.putString("nomeUsuario", etNome.text.toString())

        // salva os dados na memoria do cel
        editor.commit()

        // faz o mesmo que o commit mas assincrono:
        // editor.apply()
    }
}
