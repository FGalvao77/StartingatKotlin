package my.Codes.Kotlin

// Funções de membro e extensões com um único parâmetro podem ser
// transformadas em funções infix.

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)             // 1
    println(2 times "Bye ")                                            // 2
    println(10 times "...")

    val par = "Fernando" to "Katia"                                    // 3
    println(par)

    infix fun String.onto(other: String) = Pair(this, other)           // 4
    val meuPar = "Marido" onto "Esposa"
    println(meuPar)

    val sara = Pessoa("Sara")
    val eloah = Pessoa("Eloah")
    sara minhasFilhas eloah                                             // 5
}

class Pessoa(val nome: String) {
    val amaFilhas= mutableListOf<Pessoa>()
    infix fun minhasFilhas(other: Pessoa) {amaFilhas.add(other)}        // 6
}

// 1. Define uma função de extensão de infix em Int.
// 2. Chama a função infix.
// 3. Cria um par chamando a função infix da biblioteca padrão.
// 4. Aqui está sua própria implementação de para chamada criativamente.
// 5. A notação Infix também funciona em funções de membros (métodos).
// 6. A classe contida se torna o primeiro parâmetro.

// Observe que o exemplo usa funções locais (funções aninhadas em outra função).