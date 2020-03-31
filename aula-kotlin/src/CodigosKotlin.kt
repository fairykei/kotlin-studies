class CodigosKotlin {

    fun executar() {
        println("boa noite, kotlin!")
        println("É nóis na Bandtec!")

        // tipagem dinâmica
        // "val" indica que o valor é IMUTÁVEL (não pode ser alterado)
        val bairro = "Saúde"

        // interpolação com variável ou constante
        println("Eu venho do bairro ${bairro}")

        // interpolação com operação matemática
        println("Quanto é o dobro de 15? ${15 * 2}, sabia?")

        // tipagem estática
        val idade:Int = 39
        val altura:Double = 1.72
        val casado:Boolean = true
        val sobrenome:String = "Ramos"

        val inteiroA = "88".toInt()
        val realA = "7.5".toDouble()

        val salarioX = 4000.0
        calcularInss(salarioX)

        calcularCreche(2000.0, 3, "Roberto")

        // multiline String (texto c/ várias)
        val instrucaoSql = """
            select * from 
            bla bla
            where x > 9
            order by hahaha
        """.trimIndent()
        // o "trimIndent()" ao final retira a primeira e última
        // quebras de linha e todos os espaços antes das linhas

        println(instrucaoSql)


    }

    fun calcularInss(salario:Double) {
        // supondo que o inss é sempre 10% do salário
        val inss = salario * 0.1

        println("O INSS de ${salario} será ${inss}")
    }

    // criar um função que:
    // receba o valor de salário, e nome e
    // a quantidade de filhos que uma pessoa tem
    // calcular o aux. creche: 5% do salário p/ filho
    // Ao final, exibir:
    // Olá, NOME, seu aux creche sobre SAL será de AUX
    // invocar esta função no final da "executar()"
    // testar
    fun calcularCreche(salario:Double, filhos:Int, nome:String) {
        val auxCreche = salario * 0.05 * filhos
        println("Olá, ${nome}, seu aux creche sobre ${salario} será de ${auxCreche}")
    }

    /*
    Crie uma função que:
    receba o nome da pessoa e sua altura, o resultado será
    caso a altura for até 1.3 "é um anão"
    caso a altura for mais que 1.3 até 1.7 "serve p/ muitos esportes"
    caso a altura for mais de 1.7 "serve p/ volei e basquete"
    Ao final, exiba a frase
    "NOME, você RESULTADO"
    teste usando o função "executar()" passando qualquer valor
    // DICA: o if, else e else-if são IDENTICOS ao Java e JS
     */

}