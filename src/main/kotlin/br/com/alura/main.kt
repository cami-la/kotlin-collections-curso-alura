package br.com.alura

fun main() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("Alex")

    println("Nomes salvos: $nomesSalvos")

    banco.salva("Amanda")
    println("Nomes salvos: $nomesSalvos")

    println(BancoDeNomes().nomes)

    BancoDeNomes().salva("Camila")
    println("Nomes salvos: $nomesSalvos")
    println(BancoDeNomes().nomes)


}

class BancoDeNomes {
    val nomes : Collection<String> get() = Companion.dados.toList()

    fun salva(nome:String){
        Companion.dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    for (nome: String in nomes) {
        println(nome)
    }
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção: ${nomes.size}")
}