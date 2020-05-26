package com.example.appfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_resultado.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mostrarFragmento1(v: View) { // botar o onclick na tela1
        // fazendo o frag1 "entrar" na frame1
        supportFragmentManager.beginTransaction().replace(R.id.frame1, Fragmento1()).commit()
    }

    fun mostrarFragmento2(v: View) {
        //preparando parametros para a fragment
        val parametros = Bundle()
        parametros.putString("bairro", "Saúde")
        parametros.putInt("habitantes", 20000)

        // colocando os parametros na instancia do frag
        val fragmento2 = Fragmento2()
        fragmento2.arguments = parametros
        supportFragmentManager.beginTransaction().replace(R.id.frame1, fragmento2).commit()
    }

    fun mostrarResultado(v: View) {
        //preparando parametros para a fragment
        val media = etMedia.text.toString().toFloat()

        val parametros = Bundle()
        parametros.putFloat("media", media)

        // colocando os parametros na instancia do frag
        val resultado = Resultado()
        resultado.arguments = parametros
        supportFragmentManager.beginTransaction().replace(R.id.frame1, resultado).commit()
    }
}
