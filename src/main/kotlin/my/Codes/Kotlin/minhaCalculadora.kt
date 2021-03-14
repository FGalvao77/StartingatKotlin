package my.Codes.Kotlin

// Criando um calculadora simples:
// somar, subtrair, multiplicar e dividir

//declarando as variáveis fora da função principal
const val x = 12.57
const val y = 29.11

////função principal
fun main(){
    //val x = 12
    //val y = 2

    val resultadoSomar = somar(x, y)
    val resultadoSubtrair = subtrair(x, y)
    val resultadoMultiplicar = multiplicar(x, y)
    val resultadoDividir = dividir(x, y)

    println("Segue os resultados abaixo:")
    println("\tSoma dos números $x e $y é:            $resultadoSomar")
    println("\tSubtração dos números $x e $y é:       $resultadoSubtrair")
    println("\tMultiplicação dos números $x e $y é:   $resultadoMultiplicar")
    println("\tDivisão dos números $x e $y é:         $resultadoDividir")
}

//declarando as funções e seus respectivos métodos
//resultado declarado sendo do tipo Double

//adição
fun somar(x:Double, y:Double) = x + y

//subtração
fun subtrair(x:Double, y:Double) = x - y

//multiplicação
fun multiplicar(x:Double, y:Double) = x * y

//divisão
fun dividir(x:Double, y:Double) = x / y