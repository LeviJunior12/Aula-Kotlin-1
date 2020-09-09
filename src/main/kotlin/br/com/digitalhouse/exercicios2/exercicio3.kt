package br.com.digitalhouse.exercicios2

class Atleta(var nome: String, var nivel: Int, var energia: Int) {

}

class Prova(var dificuldade: Int, var energiaNecessario: Int, val atleta: Atleta) {
    fun podeRealizar(): Boolean {
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessario
    }
}

fun main() {
    val atleta1 = Atleta("Levi", 100, 50)
    val atleta2 = Atleta("Maria", 20, 75)
    val atleta3 = Atleta("Clarice", 65, 34)

    // Atleta 1
    val prova1 = Prova(10, 5, atleta1)
    println(prova1.podeRealizar())
    val prova11 = Prova(21, 15, atleta1)
    println(prova11.podeRealizar())
    val prova111 = Prova(11, 10, atleta1)
    println(prova111.podeRealizar())

    // Atleta 2
    val prova2 = Prova(10, 5, atleta2)
    println(prova2.podeRealizar())
    val prova22 = Prova(21, 15, atleta2)
    println(prova22.podeRealizar())
    val prova222 = Prova(11, 76, atleta2)
    println(prova222.podeRealizar())

    //Atleta 3
    val prova3 = Prova(10, 5, atleta3)
    println(prova3.podeRealizar())
    val prova33 = Prova(66, 15, atleta3)
    println(prova33.podeRealizar())
    val prova333 = Prova(11, 76, atleta3)
    println(prova333.podeRealizar())
}