package com.example.avaliacao01182028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tela3.*

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val candidato1 = intent.extras?.getString("candidato1")
        val candidato2 = intent.extras?.getString("candidato2")

        val aleatorio = (0..100).shuffled().first()
        val aleatorio2 = (0..100).shuffled().first()

        if (aleatorio == aleatorio2) {
            tvVencedor.text = "@string/txt_empate1"
            ivVencedor.setImageResource(R.drawable.terceiro)
            tvVotos.text = "@string/txt_empate"
        } else if (aleatorio > aleatorio2) {
            val qtd = aleatorio
            tvVencedor.text = candidato1
            ivVencedor.setImageResource(R.drawable.primeiro)
        } else if (aleatorio < aleatorio2) {
            val qtd = aleatorio2
            tvVencedor.text = candidato2
            ivVencedor.setImageResource(R.drawable.segundo)
        }
    }
}