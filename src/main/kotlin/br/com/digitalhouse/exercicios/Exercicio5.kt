package br.com.digitalhouse.exercicios

fun main() {
    println(analisarNumeros(1, 2, 3, 4))
}

fun analisarNumeros(numA: Int, numB: Int, numC: Int, numD: Int) {
    if(numA > numC && numA > numD || numB > numC && numB > numD) {
        return true
    } else {
        return false
    }
}