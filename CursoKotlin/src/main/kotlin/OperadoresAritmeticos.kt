fun main(){

    val soma = 10 + 5 // soma será 15
    val diferenca = 10 - 5 // diferenca será 5
    val produto = 10 * 5 // produto será 50
    val quociente = 10 / 5 // quociente será 2
    val resto = 10 % 3 // resto será 1


    println("Soma de 10 + 5 = $soma")
    println("Subtração de 10 - 5 = $diferenca")
    println("Multiplicação de 10 * 5 = $produto")
    println("Divisão de 10 / 5 = $quociente")
    println("Resto de 10 % 3 = $resto")
    println("Incremento x++ ")
    println("Decremento x-- ")

    val peso: Int = 78
    val altura: Double = 1.92
    val imc = Math.round(peso /(altura * altura))

    print(imc)
}