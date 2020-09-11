package br.com.digitalhouse.exercicio_santander

class ContaCorrente(saldo: Double, cliente: Cliente) : Conta(saldo, cliente) {
    override fun sacarDinheiro(valor: Int) {
        this.saldo -= valor
        println("Foi feito o saque de ${valor}")

        if(saldo < 0) {
            println("Você pode usar cheque especial")
        }
    }

    override fun consultarSaldo() {
         println("O saldo é: ${this.saldo}")
    }

    fun depositarDinheiro(valor: Int) {
        this.saldo += valor
        println("Foi feito o deposito de ${valor}")
    }

    fun depositarCheque(valor: Double, bancoEmissor: String, dataPagamento: String) {
        this.saldo += valor
        println("Foi feito o deposito do cheque no valor de: ${valor}")
    }
}