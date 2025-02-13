fun main() {

    var soma = 0.0
    val qtdNotas = 3

    for (i in 1..qtdNotas) {
        print("Digite um numero $i: ")
        val nota = readLine()?.toDoubleOrNull()
        if (nota != null) {
            soma += nota
        } else {
            print("Digite somente Números")
            return
        }
    }

    val media = soma / qtdNotas
    println("Média é:  $media")

    when {
        media >= 7 -> println("Aprovado")
        media >= 5 -> println("Recuperação")
        media <= 4 -> println("Reprovado")
    }
}