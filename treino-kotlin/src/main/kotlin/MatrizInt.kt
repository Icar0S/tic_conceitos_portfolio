fun main(){
    val lin = 3
    val col = 6
    val matriz: Array<Array<Int>> = Array(lin) { Array(col) {0} }
    var dig = -1
    for(i in 0 until lin){
        for(j in 0 until col){
            print("${matriz[i][j]} ")
        }
        println()
    }

    println("===== IMPRESSÃO DA MATRIZ =====")
    for(i in 0 until lin){
        for(j in 0 until col){
            matriz[i][j] = ++dig
            print("${matriz[i][j]}  ")
        }
        println()
    }

    println("===== IMPRESSÃO 2 DA MATRIZ =====")
    for( lin in matriz ){
        for( valor in lin ){
            print("${valor} ")
        }
        println()
    }

}