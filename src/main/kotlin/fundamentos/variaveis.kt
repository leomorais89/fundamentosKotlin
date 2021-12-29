package fundamentos

fun main() {
    var nome = "Gustavo"
    val nomeVal = "Gustavo"

    nome = "Daniel"
    //nomeVal = "Daniel"

    val idade = 24
    println(idade)

    val teste: String
    teste = "Teste"

    var texto = "Texto"
}

class variaveis {
    lateinit var teste: String

    fun iniciaVariaveis() {
        teste = "Teste"
    }
}
