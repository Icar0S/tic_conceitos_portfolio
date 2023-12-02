
class Robo{
    lateinit var nome:String
    fun ligar(){
        nome = "Iniciando o robô..."
    }
    fun inicio_tardio(){
        if(!this::nome.isInitialized){
            nome = "Inicializando tardiamente..."
            println(nome)
        }
    }
}

fun main() {
    var bot:Robo = Robo()
    println(bot.ligar())
    bot.inicio_tardio()
    println(bot.nome)
}