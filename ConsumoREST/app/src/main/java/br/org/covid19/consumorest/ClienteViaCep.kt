package br.org.covid19.consumorest

import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder

object ClienteViaCep {

    // nesta função, codificamos o necessário para o Feign criar, em tempo de execução
    // uma implementação de CepRequests. A URL base da API é indicada aqui (https://viacep.com.br/)
    fun criar():CepRequests {
        return Feign.builder()
            .decoder(GsonDecoder()) // como o Feign vai consumir os JSON
            .encoder(GsonEncoder()) // como o Feign vai criar os JSON
            .target(CepRequests::class.java, "https://viacep.com.br/")
    }
}