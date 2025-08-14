package latihan_kotlin

fun main() {
    val examValue = 65

    if(examValue > 90){
        println("Cool")
    } else if(examValue > 75){
        println("Good job")
    } else if (examValue > 60){
        println("Not Bad")
    } else {
        println("Silahkan coba lagi tahun depan")
    }
}