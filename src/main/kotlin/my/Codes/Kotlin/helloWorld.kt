package my.Codes.Kotlin                     // 1

fun main() {                                // 2
    println("\tHello, World!" +              // 3
            "\n\tWelcome to KOTLIN!")

}

// 1. O código Kotlin geralmente é definido em pacotes.
// A especificação do pacote é opcional: se você não especificar um
// pacote em um arquivo de origem, seu conteúdo irá para o pacote padrão.

// 2. Um ponto de entrada para um aplicativo Kotlin é a função
// principal. No Kotlin 1.3, você pode declarar main sem nenhum
// parâmetro. O tipo de retorno não é especificado, o que significa
// que a função não retorna nada.

// 3. println escreve uma linha na saída padrão. Ele é importado
// implicitamente. Observe também que os pontos-e-vírgulas são opcionais.

// Nas versões do Kotlin anteriores a 1.3, a função principal deve ter um
// parâmetro do tipo Array <String>.

