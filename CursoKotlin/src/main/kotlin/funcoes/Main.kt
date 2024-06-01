package funcoes

fun main(){

    mensagem()

    val num1 = 5
    val num2 = 10
    val num3 = 7.9f
    val num4 = 9.8f

    val soma = soma(num1, num2)
    val sub = subtracao(num1, num2)
    val multi = multiplicacao(num1, num2)
    val div = divisao(num3, num4)

    println("A soma de $num1 + $num2 = $soma")
    println("A subtração de $num1 - $num2 = $sub")
    println("A multiplicação de $num1 x $num2 = $multi")
    println("A Divisão de $num1 / $num2 = $div")
}


//função sem retorno
fun mensagem(){
    println("Aritimética")
}

//função com retorno do tipo insteiro
fun soma( num1: Int, num2: Int): Int{
    return (num1 + num2)
}

fun subtracao(num1: Int, num2: Int): Int{
    return (num1 - num2)
}

//função de única linha
fun multiplicacao(num1: Int, num2: Int) = (num1 * num2)

fun divisao(num1: Float, num2: Float) = (num1 / num2)