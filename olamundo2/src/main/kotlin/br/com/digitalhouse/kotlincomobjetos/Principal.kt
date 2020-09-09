package br.com.digitalhouse.kotlincomobjetos

fun main() {
    /*val brasileiro = Pessoa()
    println("O brasileiro é ${brasileiro.name} e têm a idade de ${brasileiro.idade}")

    brasileiro.name = "Sérgio"
    println("O brasileiro é ${brasileiro.name} e têm a idade de ${brasileiro.idade}")

    brasileiro.name = "Levi"
    println("O brasileiro é ${brasileiro.name} e têm o sobrenome de ${brasileiro.sobrenome}")

    // brasileiro.sobrenome = "teste" //A variavel val não pode ser trocado*/

    //---------------------------------------------------------------------
    // Crtl + p mostra os parametros
    val cachorro = Cachorro("Bidu",2, "Golden")
    println("O nome do cachorro é ${cachorro.nome}")
    println("A raça é ${cachorro.raca} e a idade ${cachorro.idade}")

    //--------------------------------------------------------------------
    val brasileiro = Pessoa("Levi", "Junior")
    // brasileiro.andar()
    println(brasileiro.criarRG(brasileiro.nome, 1454345))
    brasileiro.passearComDog(cachorro)
}