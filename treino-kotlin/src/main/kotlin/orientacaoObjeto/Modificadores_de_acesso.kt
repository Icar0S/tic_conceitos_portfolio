
// Private, Public e Protected

private class F(){ // Estará disponível somente no arquivo.
    var teste = "Classe F"
}
open class Eletronico( var marca:String){
    private fun ativarCorrente(){ // Está disponível somente na classe a que pertence.

    }
    protected  fun relogio(){ // Está disponível a classes que são herdadas.
        println("Função relógio")
    }
    fun ligar(){
        println("Está ligado")
    }
    fun desligar(){
        println("Está desligado")
    }
   var modelo:String = "Teste de herança"
    private var F:String = "Testendo..." // Está disponível somente na classe a que pertence.

}

class Computador(marca:String):Eletronico(marca){
    fun InstalarSoftware(){
        println("Instalando Softwares no computador")
        relogio()

    }
    fun Varredura(){
        println("Realizando varredura no computador")
        ligar()
        desligar()

    }
}



fun main( ) {
    var c:Computador = Computador("Dell")
    c.ligar()
    c.desligar()
    c.Varredura()
    c.InstalarSoftware()
    println(c.modelo)
    //c.F
    //c.ativarCorrente()
    var t:F = F()
    println(t.teste)
    //c.relogio()


}