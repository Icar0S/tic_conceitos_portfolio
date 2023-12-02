
open class Eletronico(marca:String){
    fun ligar(){
        println("Está ligado")
    }
    fun desligar(){
        println("Está desligado")
    }
    var modelo:String = "Teste de herança"
}

class Computador(marca:String):Eletronico(marca){
    fun InstalarSoftware(){
        println("Instalando Softwares no computador")
    }
    fun Varredura(){
        println("Realizando varredura no computador")
    }
}

fun main( ) {
    var c:Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.Varredura()
    c.InstalarSoftware()
    println(c.modelo)
}