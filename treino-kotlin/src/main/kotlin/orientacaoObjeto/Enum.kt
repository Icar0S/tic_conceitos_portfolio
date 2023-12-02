
enum class Prioridade{
    Baixa, Media, Alta
}
enum class Animais{
    gato, cachorro, tucano, papagaio, leopardo
}
enum class Prioridade_2(val v:Int){
    B(0), M(7), A(10)
}
enum class Prioridade_3(val value:Int){
    A(10){
        override fun toString(): String {
            return "Prioridade Alta com o valor $value"
        }
    },
    M(5){
        override fun toString(): String {
            return "Prioridade Média com o valor $value"
        }
    },
    B(0){
        override fun toString(): String {
            return "Prioridade Baixa com o valor $value"
        }
    }
}
fun x(p:Prioridade){

}
fun main() {
    x(Prioridade.Alta) // Forma de acessar um valor de uma classe do tipo Enum.
    for (p in Prioridade.values()){
        print("$p ")
    }
    println()
    for (p in Animais.values()){
        print("$p ")
    }
    println()
    for (p in Prioridade_2.values()){
        print("${p.v} ")
    }
    println()
    for (p in Prioridade_3.entries){
        println(p)
    }
}