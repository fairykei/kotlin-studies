package com.example.appfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_resultado.*

/**
 * A simple [Fragment] subclass.
 */
class Resultado : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resultado, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val media = arguments?.get("media").toString().toFloat()

        if (media >= 5) {
            tvResultado.text = "Aprovado!"
            ivImagem.setImageResource(R.drawable.image1)
        } else {
            tvResultado.text = "Reprovado!"
            ivImagem.setImageResource(R.drawable.image2)
        }
    }
}
