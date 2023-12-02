package `controleFluxo-tratamentoDados`

fun main(){
    var testM: Int = 11//mutate
    val testIm: Int = 23//immutable
    var testFloat: Float = 123.45f
    var testChar: Char = 'F'
    var testStr: String = "Icaro"
    var testShort: Short = 100
    var testByteBin: Byte = 0b1010 //bin
    var testByteHex: Byte = 0xf //hex
    var testUint: UInt = 212u
    println(testM)
    println(testIm)
    println(testFloat)
    println(testChar)
    println(testStr)
    println(testShort)
    println(testByteBin)
    println(testByteHex)
    println(testUint)
    println("=========================")
    println("CAPACIDADE DE CADA TIPO")
    println("ULong max: ${ULong.MAX_VALUE} ULong min: ${ULong.MIN_VALUE}")
    println("UInt max: ${UInt.MAX_VALUE} UInt min: ${UInt.MIN_VALUE}")
    println("Short max: ${Short.MAX_VALUE} Short min: ${Short.MIN_VALUE}")

}