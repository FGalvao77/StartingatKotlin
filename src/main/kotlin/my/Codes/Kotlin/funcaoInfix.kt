package my.Codes.Kotlin

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)             // 1
    println(2 times "Bye")                                             // 2

    val par = "Fernando" to "Katia"                                   // 3
    println(par)

    infix fun String.onto(other: String) = Pair(this, other)           // 4
    val meuPar = "Marido" onto "Esposa"
    println(meuPar)

    val sara = Pessoa("Sara")
    val eloah = Pessoa("Eloah")
    sara minhasFilhas eloah                                                    // 5
}

class Pessoa(val nome: String) {
    val amaFilhas= mutableListOf<Pessoa>()
    infix fun minhasFilhas(other: Pessoa) {amaFilhas.add(other)}             // 6
}
