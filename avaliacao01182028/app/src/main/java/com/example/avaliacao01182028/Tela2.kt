package com.example.avaliacao01182028

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_tela2.*
import kotlinx.android.synthetic.main.activity_tela3.*

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
    }

    fun simularVotacao(v: View) {
        val tela3 = Intent(this, Tela3::class.java)

        val candidato1 = etPrimeiro.text.toString()
        val candidato2 = etSegundo.text.toString()
        tela3.putExtra("candidato1", candidato1)
        tela3.putExtra("candidato2", candidato2)

        startActivity(tela3)
    }

}
