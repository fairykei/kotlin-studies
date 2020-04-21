package br.org.covid19.consumorest

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pesquisarEndereco(v:View) {
        val cepPesquisa = etCep.text.toString()

        // criei uma GetCepTask e fiz a chamada assincrona que usa o Feign p/ consumir o EndPoint
        val resultado = GetCepTask().execute(cepPesquisa).get()

        val msg = "Endereço: ${resultado.logradouro} - ${resultado.bairro} - ${resultado.localidade}"

        tvEndereco.text = msg
    }

}
