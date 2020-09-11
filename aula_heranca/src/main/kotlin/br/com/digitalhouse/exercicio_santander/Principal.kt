package br.com.digitalhouse.exercicio_santander

fun main() {
    var cliente = Cliente(1, "Junior", "131313", "09999999" )
    var cpCliente = ContaPoupanca(1000.0, cliente)
    var ccCliente = ContaCorrente(2000.0, cliente)

    cpCliente.depositarDinheiro(45)
    cpCliente.sacarDinheiro(45)
    cpCliente.recolherJuros()
    cpCliente.consultarSaldo()
    cpCliente.sacarDinheiro(33)
    cpCliente.consultarSaldo()

    println("-------------------------------------")

    ccCliente.consultarSaldo()
    ccCliente.sacarDinheiro(33)
    ccCliente.consultarSaldo()
    ccCliente.depositarDinheiro(50)
    ccCliente.consultarSaldo()
    ccCliente.depositarCheque(50.0, "Itau", "27/08/2020")
}