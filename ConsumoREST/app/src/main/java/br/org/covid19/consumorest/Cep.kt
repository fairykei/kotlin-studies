package br.org.covid19.consumorest

// aqui mapeamos um JSON de um Endpoint que vamos consumir
data class Cep(val logradouro:String, val bairro:String, val localidade:String)