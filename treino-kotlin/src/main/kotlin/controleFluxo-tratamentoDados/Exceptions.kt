package `controleFluxo-tratamentoDados`

import kotlin.math.sqrt

fun main() {
    val num = 10
    val den = 1 //0 ou 1

    try{
        val res = num/den
        println(res)
    }catch (e: ArithmeticException){
        println("erro")
    }

    try{
        var s: String? = null
        println("O tamanho da string é: ${s!!.length}")

        var a = 10/0
        println("resultado será: $a")

        var b = -9.0
        var c = sqrt(b)
            if(b<0){
                throw IllegalArgumentException()
            }
        var x=1
            if(x==1){
                throw Exception("O valor de x não pode ser 1")
            }

    }catch (e: ArithmeticException){
        println("erro em divisão por zero")
    }catch (e: NullPointerException){
        println("A variavel esta vazia")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz de numero negativo")
    }catch (e: Exception){
        print("Exceção geral")
        println(e.message)
    }

    try{
        var s: String? = null
        s="Icaro"
        println("O tamanho da string é: ${s!!.length}")

        var a = 10/0
        println("resultado será: $a")

        var b = -9.0
        var c = sqrt(b)
        if(b<0){
            throw IllegalArgumentException()
        }
        var x=1
        if(x==1){
            throw Exception("O valor de x não pode ser 1")
        }

    }catch (e: ArithmeticException){
        println("erro em divisão por zero")
    }catch (e: NullPointerException){
        println("A variavel esta vazia")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz de numero negativo")
    }catch (e: Exception){
        print("Exceção geral")
        println(e.message)
    }

    try{

        var a = 10/1
        println("resultado será: $a")

        var b = 9.0
        var c = sqrt(b)
        if(b<0){
            throw IllegalArgumentException()
        }
        var x=1
        if(x==1){
            throw Exception("O valor de x não pode ser 1")
        }

    }catch (e: ArithmeticException){
        println("erro em divisão por zero")
    }catch (e: NullPointerException){
        println("A variavel esta vazia")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz de numero negativo")
    }catch (e: Exception){
        print("Exceção geral: ")
        println(e.message)
    }


}