package br.com.digitalhouse.exercicios

fun main() {
    imprimirValoresPares()
}

fun imprimirValoresPares() {
    for (numero in 0 .. 100) {
        if(numero%2 == 0) println(numero)
    }
}