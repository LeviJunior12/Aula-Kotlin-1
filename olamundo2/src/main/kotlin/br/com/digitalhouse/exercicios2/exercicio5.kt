package br.com.digitalhouse.exercicios2

class Concessionaria() {
    fun registrarVenda(veiculo: Veiculo, cliente1: Cliente1, valor: Double) {
        var registroVenda =  Venda(cliente1, veiculo, valor)
        println("Registro da venda de: $${registroVenda.valorVenda}")
        println("A venda do veiculo ${veiculo.modelo} foi feita pelo valor de $${valor} ao cliente ${cliente1.nome}")
    }
}

class Cliente1(var nome: String, var sobrenome: String, var email: String) {

}

class Venda(var cliente: Cliente1, var veiculo: Veiculo, var valorVenda: Double) {

}

class Veiculo(var marca: String, var modelo: String, var anoFabricacao: Int, var cor: String, var quilometragem: Double) {

}

fun main() {
    var veiculo = Veiculo("Ford", "Mustang", 2020, "Preto", 0.0)
    var cliente = Cliente1("Levi", "Junior", "levi@gmail.com")
    var concessionaria1 = Concessionaria()
    concessionaria1.registrarVenda(veiculo, cliente, 200000.0)
}