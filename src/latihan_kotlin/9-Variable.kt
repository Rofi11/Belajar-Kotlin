package latihan_kotlin

// Variable Constant (Global Variable)
const val APP : String = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
//    Mutable
    var firstName : String = "Eko"
    //    deklarasi tipe data adalah optional, karena kotlin bisa tau
    var lastName = "Khannedy"

    // kita coba rubah
    lastName = "Kurniawan Khaneedy" //disini tidak akan terjadi error

//    Immutable
    val kode_pos : Int = 40552
    // ini akan error karena menggunakn val (Immutable)
//    kode_poss = 90888

// Nullable, menggunakan ?
    // kurang di rekomndasikan, jika tikda terpaksa dan mengakses Kode java
    var name : String? = null
    name = "Eko"
    println(name)
    println(name?.length)

    println("Welcome to $APP version $VERSION")
}