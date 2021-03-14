package my.Codes.Kotlin

// Determinadas funções podem ser "atualizadas" para operadoras,
// permitindo suas chamadas com o símbolo de operadora correspondente.

fun main() {

operator fun Int.times(str: String) = str.repeat(this)                      // 1
    println(2 * "Bye ")                                                        // 2

operator fun String.get(range: IntRange) = substring(range)                    // 3
val str = "Always forgive your enemies; nothing annoys them so much"
    println(str[0..14])                                                        // 4

val fullName = "Fernando Galvão"                                               // extra 1
    println("Full name: $fullName")
    println("\tFirst name: ${fullName[0..8]}\n" +
            "\tLast name: ${fullName[9..14]}")
}

// 1. Isso leva a função infix acima uma etapa adiante, usando o modificador de operador.

// 2. O símbolo do operador para times () é * para que você possa chamar a função usando 2 * "Bye ".

// 3. Uma função de operador permite fácil acesso ao alcance do range.

// 4. O operador get() ativa a sintaxe de acesso com utilização de colchetes.

// extra 1. Explorando as possibilidades de fatiamento de frase, nesse caso o meu nome completo.
