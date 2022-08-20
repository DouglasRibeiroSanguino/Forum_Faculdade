package forum.faculdade

fun main(){
    println("Olá, Bem-Vindos!")
    println()
    println("Escolha 1 para: O que é Lógica?")
    println("Escolha 2 para: O que é Proposição?")
    println("Escolha 3 para: O que são Premissas?")
    println("Escolha 4 para: O que são Argumentos?")
    println("Escolha 5 O que é Silogismo?")
    println("Escolha 6 O que é Falácia?")
    println("Escolha 7 O que é inferência? Quais os tipos?")

    val escolha = readLine()!!.toInt()

    when(escolha) {
        1 -> println("Lógica é basicamente uma sequência de ações que fazemos para tentar resolver um problema " +
                "ou um básico exemplo de uma sequência que fazemos todos os dias de manhã como fazer café!")

        2 -> println("Proposíção Lógica é uma forma de expressar algo verdadeiro ou falso, mas nunca para ambas" +
                " também conhecida por sentença fechada!")

        3 -> println("É uma fórmula considerada hipoteticamente verdadeira, dentro de uma dada inferência." +
                " Esta constitui-se de duas partes: uma coleção de premissas, e uma conclusão")

        4 -> println("A noção de argumento é fundamental para a lógica. Argumento é um conjunto de " +
                "enunciados que estão relacionados uns com os outros. Argumento é um raciocínio lógico")

        5 -> println("O silogismo é uma forma de raciocínio dedutivo, vai do geral para o particular, " +
                "isto é, a partir de uma totalidade portadora de atributos, tira-se uma verdade que é aplicada a todos os seus componentes")

        6 -> println("Uma falácia lógica é uma afirmação que pode parecer à primeira vista verdadeira, " +
                "mas, depois de aplicar as regras da lógica, não é. " +
                "\nFalácias lógicas muitas vezes podem ser tentativas de enganar as pessoas e fazê-las acreditar em algo que não é necessariamente verdade")

        7 -> println("O termo inferência usa-se por vezes como sinónimo de raciocínio. Embora tal associação não seja incorrecta , " +
                "a verdade é que inferência possui um sentido mais abrangente que raciocínio" +
                "\nOs tipos são:" +
                "\nA inferência imediata consiste em extrair de uma só proposição outra proposição, à qual se atribui o valor de verdade ou falsidade. " +
                "\nA inferência imediata pode ser obtida por oposição ou conversão" +
                "\n" +
                "\nA inferência mediata consiste numa conclusão obtida a partir de duas ou mais proposições. " +
                "\nEste tipo de inferências podem ser de três tipos: analógicas, indutivas e dedutivas")

        else -> println("Saindo...")
    }
}