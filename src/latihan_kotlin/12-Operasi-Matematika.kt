package latihan_kotlin

fun main() {
//    Pembagian Integer
    val result1 : Int = 10 / 3
    println(result1) // result nya 3, karena Integer tidak akan membuat floating angka

//    Pembagian floating
    val resultFloat : Double = 10.0 / 3.0
    println(resultFloat)

//    Prioritas dalam Operasi matematika kotlin KAKABATAKU (kali, bagi, tambah, kurang)
    // operasi nya disini akan dimulai dari pembagian dulu
    val result2 : Int = 10 + 10 / 2
    println(result2)

//    Augmented Assignments (mempersingkat sintaks)
    var total : Int = 0

    val barang1 = 100
    total += barang1
    val barang2 = 200
    total += barang2
    val barang3 = 300
    total += barang3
    println(total)
//    Unary Operator
    total++ // total = total + 1
    println("Unary Operator $total")

    // Negative
        // untuk Positive default dari semua angka adalah positive
    val suhu = -5
    println(suhu)
    val sehat = true
    println(!sehat)

}