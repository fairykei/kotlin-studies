package com.example.poliglotaii

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // recuperando textos do strings.xml
        // pegando o texto de nome "carregou"
        val txtCarregou = getString(R.string.carregou)

        Toast.makeText(this, txtCarregou, Toast.LENGTH_SHORT).show()
    }

    fun descrever(v:View) {
        // recuperando um texto do string.xml que requer parâmetros
        val descricao = getString(R.string.descricao, "Yoshi", 30, 1.50)

        Toast.makeText(this, descricao, Toast.LENGTH_LONG).show()
    }
}
