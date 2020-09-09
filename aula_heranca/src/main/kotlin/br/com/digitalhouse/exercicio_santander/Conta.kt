package br.com.digitalhouse.exercicio_santander

abstract class Conta(var saldo: Double, var cliente: Cliente) {
    abstract fun sacarDinheiro()
    abstract fun consultarSaldo()
}