package com.example.avaliacao01182028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //multiplas telas tela1
    fun irTela2(v: View) {
        // colocar essa função no onclick do botão no xml de layout
        val tela2 = Intent(this, Tela2::class.java) // cria um intent mas nao realiza a ação

        tela2.putExtra("usuario", "let")
        tela2.putExtra("idade", 20)
        tela2.putExtra("isAdmin", true)

        startActivity(tela2) // realiza a ação desejada
    }

    fun sairApp(v: View) {
        finishAffinity() // função nativa que finaliza o app
    }


    //multiplas telas tela2
    var contadorTela2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val usuario = intent.extras!!.getString("usuario")
        val idade = intent.extras!!.getInt("idade")
        val isAdmin = intent.extras?.getBoolean("isAdmin")

        val mensagem = "O usuario ${usuario} tem ${idade} anos. Administrador? ${isAdmin}"
        Toast.makeText(this, mensagem,Toast.LENGTH_LONG).show()
    }

    fun contar(v: View) {
        contadorTela2++
        tvTopoTela2.text = "Você já clicou ${contadorTela2} vezes!"
    }

    // override da fun padrao do botao voltar
    override fun onBackPressed() {
        if (contadorTela2 >= 5) {
            super.onBackPressed() // chama a fun padrao
        } else {
            tvTopoTela2.text = "Preciso de 5 toques, pls"
        }
    }

    fun sair(v:View) {
        finish()
    }

    //projeto-android-1
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

    //dados offline
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

    //covid19
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

    //avaliaraluno
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // este código sempre será executado antes da tela abrir
    }

    fun avaliarAluno (v:View) {
        // colocar essa função no onclick do botão no xml de layout
        val resultado = Intent(this, Resultado::class.java) // cria um intent mas nao realiza a ação

        val nomes = etNome.text.toString()
        val nota1 = etNota1.text.toString().toFloat()
        val nota2 = etNota2.text.toString().toFloat()

        resultado.putExtra("nome", nomes)
        resultado.putExtra("nota01", nota1)
        resultado.putExtra("nota02", nota2)
        startActivity(resultado) // realiza a ação desejada
    }

    //avaliaraluno resultado
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nome = intent.extras?.getString("nomes")
        val nota01 = intent.extras?.getFloat("nota1")
        val nota02 = intent.extras?.getFloat("nota2")

        val media = (nota01!! + nota02!!)?.div(2)

        if (media!! >= 6) {
            tvTexto.text = "Parabéns, ${nome}! Aprovado!"
            ivImagem.setImageResource(R.drawable.imagem1)
        } else {
            tvTexto.text = "${nome}, infelizmente, reprovado"
            ivImagem.setImageResource(R.drawable.imagem2)
        }

    }

}
