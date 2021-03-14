package my.Codes.Kotlin

// Valores de parâmetro padrão e argumentos nomeados

fun printMessage(message: String): Unit {                         // 1
    println(message)
}
fun printMessageWithPrefix(message: String,
                           prefix: String = "Info") {             // 2
    println("[$prefix] $message")
}
fun sum(x: Int, y: Int): Int {                                    // 3
    return x + y
}
fun multiply(x: Int, y: Int) = x * y                              // 4

fun divide(x: Double, y: Double) = x / y                          // extra 1

fun subtrai(x: Int, y: Int) = x - y                               // extra 2

fun main() {
    printMessage("Hi! How are u?")                                // 5
    printMessageWithPrefix("Hello", "Log")          // 6
    printMessageWithPrefix("Hello")                       // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")     // 8
    println(sum(1, 2))                                      // 9
    println(multiply(2, 8))                                 // 10
    println(divide(5.05, 7.11))                             // extra 3
    println(subtrai(7, 10))                                 // extra 4
}

// 1. Uma função simples que recebe um parâmetro do tipo String e
// retorna Unit (ou seja, nenhum valor de retorno).

// 2. Uma função que leva um segundo parâmetro opcional com o valor
// padrão Info. O tipo de retorno é omitido, o que significa que é realmente Unit.

//3. Uma função que retorna um inteiro.

//4. Uma função de expressão única que retorna um número inteiro (inferido).

// 5. Chama a primeira função com o argumento Hello.

// 6. Chama a função com dois parâmetros, passando valores para ambos.

// 7. Chama a mesma função omitindo a segunda. O valor padrão Info é usado.

// 8. Chama a mesma função usando argumentos nomeados e alterando a ordem dos argumentos.

// 9. Imprime o resultado da chamada da função sum.

// 10. Imprime o resultado da chamada da função multiplicação.

// extra 1. Função que divide dois números doubles.

// extra 2. Função que subtrai dois números inteiros.

// extra 3. Imprime o resultado da função divide, dados os argumentos x e y.

// extra 4. Imprime o resultado da função subtrai, dados x e y.

