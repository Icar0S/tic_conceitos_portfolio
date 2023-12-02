fun main() {
    //Any, Unit, Nothing
    a(123)
    u()
    n()

}
fun a(valor: Any){
    println(valor)
}
fun u():Unit{
    println("func sem retorno.")
}
fun n():Nothing{
    TODO("função a ser completada")
}