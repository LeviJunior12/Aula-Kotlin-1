package br.com.digitalhouse.exercicios2

class JogadorDeFutebol(var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {
    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols++
        println("GOOOOL")
    }

    fun correr() {
        energia -= 10
        println("Cansei")
    }
}

class SessaoDeTreinamento(var experiencia: Int) {
    fun treinarA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        println("Experiência antes do treino ${jogador.experiencia}")
        jogador.experiencia += this.experiencia
        println("Experiência depois do treino ${jogador.experiencia}")
    }
}

fun main() {
    val jogador1 = JogadorDeFutebol("Test1", 99, 50, 66, 45)
    val jogador2 = JogadorDeFutebol("Test2", 45, 66, 5, 12)

    val s1 = SessaoDeTreinamento(5)
    s1.treinarA(jogador1)

    val s2 = SessaoDeTreinamento(25)
    s2.treinarA(jogador2)
    s2.treinarA(jogador2)
}

