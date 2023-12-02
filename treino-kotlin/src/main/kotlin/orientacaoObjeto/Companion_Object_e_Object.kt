
class Matematica(){
        companion object M{ // Escopo Classe
            val PI = 3.1415
            fun adc(){

            }
            init {
                println("Iniciando companion")
            }
        }
    object objt01{
        val euler = 0.03
        val PI =3.1415
        fun adc(){}
        init {
            println("Iniciando objeto 01")
        }
    }
    object objt02{
        val dourado = 1.61
        val PI =3.1415
        fun adc(){}
        init {
            println("Iniciando objeto 02")
        }
    }
    object objt03{
        val t =8
        val PI =3.1415
        fun adc(){}
        init {
            println("Iniciando objeto 03")
        }
    }
}

fun main() {
   // println(Matematica.PI)
   //Matematica.adc()
    var m:Matematica = Matematica();
    println("Acessando objeto 01 ${Matematica.objt01.euler}")
    println("Acessando objeto 02 ${Matematica.objt02.dourado}")
   println("Acessando objeto 03 ${Matematica.objt03.t}")
    Matematica.PI // Companion.
    Matematica.PI // objt 01
    Matematica.PI // objt 02
    Matematica.PI // objt 03
    Matematica.PI // não imprime
    Matematica.PI // não imprime
}