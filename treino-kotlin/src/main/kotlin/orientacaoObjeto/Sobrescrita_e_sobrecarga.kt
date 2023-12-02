
open class eletronico(var marca:String){
    private fun corrente(ativo:Boolean){}
    open fun ligar(){
        corrente(true)
    }
    open fun desligar(){
        corrente(false)
    }
}

class PC(marca:String):eletronico(marca){
    fun salvar(){}
    override fun ligar() { // Sobrescrevendo função.

        super.ligar()
    }
    override fun desligar() { // Sobrescrevendo função.
        salvar()
        super.desligar()
    }

    //Sobrecarga
    fun salvar(a:Int){}
    fun salvar(b:Int,c:Int){}
    fun salvar(a:Float){}
    fun salvar(x:Int, y:Int, z:Int ){}

}
fun main() {
    var pc:PC = PC("Dell")
    pc.ligar()
    pc.salvar()
    pc.desligar()
}