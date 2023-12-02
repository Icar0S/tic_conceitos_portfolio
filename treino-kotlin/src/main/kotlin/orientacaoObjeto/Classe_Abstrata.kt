
abstract class mamifero(var nome:String){ // Classe abstrata serve somente para herdar a outras classes.
    abstract fun habitat()
    abstract fun acorda()
    abstract fun fale()
    abstract fun alimentacao()
    fun tempo(){
        println("Tempo de vida do mamífero")
    }
}

class dog(nome:String):mamifero(nome){
    override fun acorda() {
        println("Cachorro está acordado")
    }

    override fun alimentacao() {
        println("Cachorro come ração")
    }

    override fun fale() {
        println("Au au")
    }

    override fun habitat() {
        println("Casinha do cachorro")
    }

}
fun main() {
    var d:dog = dog("Cachorro")
    d.tempo()
    d.acorda()
    d.fale()
    d.habitat()
    d.alimentacao()
}