package br.com.digitalhouse.exercicio_santander

class ContaPoupanca(saldo: Double, cliente: Cliente) : Conta(saldo, cliente) {
    override fun sacarDinheiro(valor: Int) {
        this.saldo -= valor
        println("Foi feito o saque de ${valor}")
    }

    override fun consultarSaldo() {
        println("O saldo é: ${this.saldo}")
    }

    fun depositarDinheiro(valor: Int) {
        this.saldo += valor
        println("Foi feito o deposito de: $${valor}")
    }

    fun recolherJuros() {
        var juros: Double = 33.0
        this.saldo += juros
        println("O juros no valor de ${juros} foi recolhido da conta o novo saldo é ${this.saldo}")
    }

}