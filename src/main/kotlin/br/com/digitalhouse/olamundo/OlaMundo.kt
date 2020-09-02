package br.com.digitalhouse.olamundo

fun main() {
    println("Hello World!")
    println(mostrarMeuNome())
    println(mostrarMeuNome2("Junior"))
    println(mostrarMeuNome3("Correia", 18))
    println(alunosDeAndroid())
    println("-------------------------------------------")
    println("LISTA DE ALUNOS")
    // Ctrl + / comenta o codigo
    // println(alunosDeAndroid2())
    for (nome in alunosDeAndroid2()) {
        println("Nome do aluno: $nome")
    }
    println("-------------------------------------------")
}

fun mostrarMeuNome(): String {
    return "Levi"
}

fun mostrarMeuNome2(sobrenome: String): String {
    return "Levi $sobrenome"
}

fun mostrarMeuNome3(sobrenome: String, idade: Int): String {

    val idadeRecebida = when (idade) {
        18 -> "Tem 18 anos"
        20 -> "Tem 20 anos"
        30 -> "Tem 30 anos"
        else -> "Não sabe a idade"
    }

    return "Levi $sobrenome e $idadeRecebida"
}

fun alunosDeAndroid(): String {

    val listaAlunos = arrayListOf<String>()
    // ctrl + d copia uma linha
    listaAlunos.add("Levi")
    listaAlunos.add("Vitoria")
    listaAlunos.add("Jessica")
    listaAlunos.add("Mariana")

    return listaAlunos.get(2)
    // return listaAlunos[2]
}

fun alunosDeAndroid2(): ArrayList<String> {

    val listaAlunos = arrayListOf<String>()
    // ctrl + d copia uma linha
    listaAlunos.add("Levi")
    listaAlunos.add("Vitoria")
    listaAlunos.add("Jessica")
    listaAlunos.add("Mariana")

    return listaAlunos
}