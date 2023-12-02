
interface Selvagem2{
    fun atacar(){
        println("O animal está prestes a atacar")
    }
}

interface quatro_patas{
    fun locomocao(){
        println("O animal se locomove em 4 patas")
    }
}

abstract class mamifero2(var nome:String){ // Classe abstrata serve somente para herdar a outras classes.
    abstract fun habitat()
    abstract fun acorda()
    abstract fun fale()
    abstract fun alimentacao()
    fun tempo(){
        println("Tempo de vida do mamífero")
    }
}

class dog(nome:String):mamifero2(nome), Selvagem2, quatro_patas{
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

    override fun atacar() {
        println("O cachorro está atacando")
    }

    override fun locomocao() {
        println("O cachorro se locomove em 4 patas")
    }

}
fun main() {
    var d:dog = dog("Cachorro")
    d.tempo()
    d.acorda()
    d.fale()
    d.habitat()
    d.alimentacao()
    d.atacar()
    d.locomocao()

}