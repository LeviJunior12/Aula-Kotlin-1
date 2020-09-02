package br.com.digitalhouse.exercicios

fun main() {
    println(parOuImpar(3))
}

fun parOuImpar(numero: Int): String {
    return if(numero%2 != 0) {
        "Impar"
    } else {
        "Par"
    }
}