package br.com.bandtec.projeto1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // esta função será executada sempre que a tela for iniciada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // este código sempre será executado antes da tela abrir
        // no caso, ele vai alterar o que está escrito no componente
        // de id "tvInicio" no XML
        tvInicio.text = "Passei pela classe! @:"
    }

    // esta função pode ser associada a um onclick de componente
    // pois tem um argumento do tipo View (o nome tanto faz)
    fun cliqueLoko(v:View) {
        // tvInicio.text = "E num é que clicou? :O"

        // pegando o texto de um componente e colocando em outro
        tvInvejoso.text = tvInicio.text
    }

    // esta função pode ser associada a um onclick de componente
    // pois tem um argumento do tipo View (o nome tanto faz)
    fun mensagemAlerta(v:View) {
        // recuperando o valor digitado numa EditText de id "etFrase"
        val frase = etFrase.text

        // criando uma mensagem de alerta do tipo Toast
        // (aquela mensagem pequena preta na parte de baixo da tela)
        Toast.makeText(this, frase, Toast.LENGTH_SHORT).show()
    }
}
