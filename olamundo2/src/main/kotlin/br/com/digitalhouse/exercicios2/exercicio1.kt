package br.com.digitalhouse.exercicios2

// Arquivo classe conta
// Como comentar todas as linha Ctrl + /
class Conta(var numeroDaConta: Int, var saldo: Double, var titular: Cliente) {

    fun deposito(qntDinheiro: Double) {
        if (qntDinheiro < 0) {
            println("Quantidade de dinheiro para sacar invalida.")
        }

        saldo += qntDinheiro
        println("Deposito $saldo")
    }

    fun saque(qntDinheiro: Double) {
        if (qntDinheiro < 0) {
            println("Quantidade de dinheiro para sacar invalida.")
        }

        if (qntDinheiro > saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= qntDinheiro
            println("Saque: ${saldo}")
        }
    }
}

// Arquivo classe cliente
class Cliente(var nome: String, var sobrenome: String) {
    init{
        if (nome == "") {
            println("Cliente foi criado sem nome!")
        }
    }
}

// Arquivo main
fun main() {
    val cliente1 = Cliente("Jomar", "Júnior")
    val contaCliente1 = Conta(123456, 1000.0, cliente1)
    contaCliente1.deposito(12.50)
    contaCliente1.saque(4.0)

    val client2 = Cliente("Levi", "Junior")
    val contaCliente2 = Conta(58746, 2000.0, client2)
    contaCliente2.deposito(10.26)
    contaCliente2.saque(5.0)


}