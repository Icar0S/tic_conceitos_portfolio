
abstract class mamifero(var nome:String){ // Classe abstrata serve somente para herdar a outras classes.
    abstract fun habitat()
    abstract fun acorda()
    abstract fun fale()
    abstract fun alimentacao()
    fun tempo(){
        println("Tempo de vida do mamífero")
    }
}

class human(nome: String):mamifero(nome){
    override fun habitat() {
        println("Terra")
    }

    override fun acorda() {
        println("Bom dia")
    }

    override fun fale() {
        println("Olá")
    }

    override fun alimentacao() {
        println("Cafe da manha")
        println("Almoço")
        println("Janta")
    }
}
fun main() {
    var h:human = human("humano")
    h.tempo()
    h.acorda()
    h.fale()
    h.habitat()
    h.alimentacao()
}