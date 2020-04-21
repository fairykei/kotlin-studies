package br.org.covid19.consumorest

import feign.Param
import feign.RequestLine

// no Feign, criamos interfaces onde mapeamos os Endpoints
interface CepRequests {

    // a anotação @RequestLine faz um método ficar mapeado a UM Endpoint
    @RequestLine("GET /ws/{cep}/json") // Endpoint: Método GET. URI /ws/{cep}/json
    fun getCep(@Param("cep") cep:String): Cep
    // Já que o retorno da função é um Cep
    // Estou assumindo que o Endpoint me trará um JSON compatível com a classe Cep
    // JSON é o tipo PADRÃO do Feign
}