fun main(){

    println("########################################################")
    println("Neste Algoritmo calcularemos a taxa de metabolismo basal")
    println("========================================================")
    println("Informe seu sexo: H para homem ou M para mulher")
    val sexo = readLine()

    if (sexo != null && (sexo.equals("H", ignoreCase = true) || sexo.equals("M", ignoreCase = true))) {
        println("Informe seu peso em quilogramas:")
        val peso: Float = readLine()?.toFloatOrNull() ?: 0f

        println("Informe sua altura em centímetros:")
        val altura: Float = readLine()?.toFloatOrNull() ?: 0f

        println("Informe sua idade:")
        val idade: Int = readLine()?.toIntOrNull() ?: 0

        // FORMULA DE GASTO CALÓRICO BASAL
        val GCB: Double = if (sexo.equals("H", ignoreCase = true)) {
            // Homens
            66.0 + (13.7 * peso) + (5 * altura) - (6.8 * idade)
        } else {
            // Mulheres
            655.1 + (9.6 * peso) + (1.8 * altura) - (4.7 * idade)
        }
        println("O seu gasto calórico basal é de $GCB calorias")

    } else {
        println("Sexo inválido. Informe H para homem ou M para mulher.")
    }

    println("\n")
    for(i in 1 .. 10){
        print("${i} ")
    }
    println("\n")
    for(i in 10 downTo  0){
        print("${i} ")
    }


}