fun main() {
    const val ZERO: Double = 0.0
    println("Olá, por favor escolha a operação que iremos realizar:")
    println("(1) Soma | (2) Subtração | (3) Multiplicação | (4) Divisão")
    val operacao: String? = readLine()!!
    if (operacao != null) {
        if (operacao.toInt() <= 4) {
            println("Qual o primeiro número?")
            val a = readLine()!!
            val aFloat = a.toDouble()
            println("Qual o segundo número?")
            val b = readLine()!!
            val bFloat = b.toDouble()

            when (operacao) {
                "1" -> println("O resultado é: ${aFloat + bFloat}")
                "2" -> println("O resultado é: ${aFloat - bFloat}")
                "3" -> println("O resultado é: ${aFloat * bFloat}")
                "4" -> if (bFloat != 0.0) {
                    println("O resultado é: ${aFloat / bFloat}")
                } else {
                    println("Não é possível dividir por 0! Tente novamente.")
                }
                else -> print("Não foi possível realizar a operação, tente novamente!")
            }
        } else {
            print("Opção inválida, tente novamente!")
        }
    }
}
