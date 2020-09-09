package br.com.digitalhouse.kotlincomobjetos

/* class Pessoa {
    // Declaração de Propriedades que já estão sendo inicializadas
    var name: String = "Levi"
    var idade: Int = 22
    val sobrenome: String = "Junior"
}*/

class Pessoa(var nome: String, var sobrenome: String) {

    fun andar() {
        println("A $nome está andando")
    }

    fun criarRG(nome: String, numero: Int): String {
        return nome + numero
    }

    fun passearComDog(cachorro: Cachorro) {
        println("Estou passeando com o meu cachorro ${cachorro.nome}")
    }

    init {
        println("Nome é: $nome")
    }
    var sexo: String = "M"

    init {
        println("Sexo é: ${sexo}")
    }
}