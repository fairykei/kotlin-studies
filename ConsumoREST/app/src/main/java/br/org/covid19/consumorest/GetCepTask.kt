package br.org.covid19.consumorest

import android.os.AsyncTask

// AsyncTask é uma classe usada p/ op. assícronas
// <Tipo dos parâmetros, Tipo do Acompanhameto, Tipo do Retorno>
class GetCepTask : AsyncTask<String, Void, Cep>() {

    override fun doInBackground(vararg params: String?): Cep {
        return ClienteViaCep.criar().getCep(params[0]!!)
    }

}
