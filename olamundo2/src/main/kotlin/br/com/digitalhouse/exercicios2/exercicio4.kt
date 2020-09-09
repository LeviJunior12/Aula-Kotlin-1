package br.com.digitalhouse.exercicios2

class Tripe(var dobrado: Boolean, var alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int) {
    fun definirAltura(novaAltura: Int) {
        this.alturaAtual += novaAltura
    }

    fun dobrar() {
         this.dobrado = true
    }

    fun desdobrar() {
        this.dobrado = false
    }

    fun guardar(): Boolean {
        return prontoParaGuardar()
    }

    fun prontoParaGuardar(): Boolean {
       return this.dobrado && this.alturaAtual == this.alturaMinima
    }

    fun usar(): Boolean {
        return prontoParaUsar()
    }

    fun prontoParaUsar(): Boolean {
        return !this.dobrado && this.alturaAtual >= this.alturaMaxima / 2
    }

}

fun main() {
    val tripe1 = Tripe(true, 0, 10, 0)

    // Dobrar e Desdobrar
    tripe1.dobrar()
    println(tripe1.dobrado)
    tripe1.desdobrar()
    println(tripe1.dobrado)

    //Pronto para Guardar e Guardar
    tripe1.dobrar()
    println(tripe1.prontoParaGuardar())
    println(tripe1.guardar())

    //Pronto para usar e usar
    tripe1.desdobrar()
    tripe1.definirAltura(6)
    println(tripe1.prontoParaUsar())
    println(tripe1.usar())

}