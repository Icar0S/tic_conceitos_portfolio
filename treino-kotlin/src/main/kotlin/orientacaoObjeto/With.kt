class OBJT{
    fun amanhecer(h:Int){
        if(h<=4 && h>=0){
            println("Está de madrugada")
        }else{
            println("Está de dia")
        }
    }
    fun acordar(n:Int){
        if(n == 0){
            println("Está dormindo")
        }else{
            println("Está acordado")
        }
    }
}

fun main() {
    var obj:OBJT = OBJT()
    obj.amanhecer(1)
    obj.acordar(0)
    println("______________________________________________")
    with(obj){
        amanhecer(1)
        acordar(0)
    }
}