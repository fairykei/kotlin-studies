package com.example.covid19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var contador:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun trocarImagem(v: View) {
        ivTopo.setImageDrawable(getDrawable(R.drawable.image2))
    }

    fun clickLouco(v:View) {
        contador++
        tvContador.text = "Cliques: ${contador}"
    }

}
