package br.com.digitalhouse.exercicios

fun main() {
    val listaDeNumeros = arrayListOf<Int>()
    listaDeNumeros.add(3)
    listaDeNumeros.add(2)
    listaDeNumeros.add(1)

    println(analisarTresNumero(listaDeNumeros))
}

fun analisarTresNumero(numeros: ArrayList<Int>): Int {
    var maiorNumero = numeros[0]
    for(numero in numeros) {
        if(numero > maiorNumero) {
            maiorNumero = numero
        }
    }

    return maiorNumero
}