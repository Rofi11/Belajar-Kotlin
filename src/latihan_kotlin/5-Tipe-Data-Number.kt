package latihan_kotlin

fun main(){
//    Pembuatan Type Integer
    var age: Int = 200
    println(age)

//    Pembuatan type Float
    var sampel :Float = 10.11F
    println(sampel)

//    Pembuatan Literal utk menyimpan sepeti colour grading
    var binary : Int = 0b1010101
    println(binary)

//    Undersocre
    var price : Long = 9_000_000_000L
    println(price)

//    Conversion
    var priceInt : Int = price.toInt()
    println(priceInt)
    var doubleBinary : Double = binary.toDouble()
    println(doubleBinary)
}