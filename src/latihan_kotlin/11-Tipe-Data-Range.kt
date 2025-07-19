package latihan_kotlin

fun main() {
//    Range utk Naik
    val rangeNaik = 1 .. 100
    println(rangeNaik)

//    Operasi Range
    println(rangeNaik.count()) // hasil nya 100 karena mengambil total nya
    println(rangeNaik.contains(50)) // True karena data range nya ADA
    println(rangeNaik.contains(200)) // False karena data range nya TIDAK ADA
    println(rangeNaik.first) // hasilnya 1
    println(rangeNaik.last) // hasilnya nya 100
    println(rangeNaik.step) // step nya 1, karena lompatan nya hanya 1

//    Range utk Turun
    val rangeTurun = 100 downTo 0
    println(rangeTurun)

    println(rangeTurun.count()) // hasil nya 100 karena mengambil total nya
    println(rangeTurun.contains(50)) // True karena data range nya ADA
    println(rangeTurun.contains(200)) // False karena data range nya TIDAK ADA
    println(rangeTurun.first) // hasilnya 100
    println(rangeTurun.last) // hasilnya nya 1
    println(rangeTurun.step) // step nya -1, karena turun jadi logika nya ke minus

//    Range dengan Step
    // angka start downTo ke angka akhir , step range nya berapa kali
    val rangeTurun2 = 100 downTo 1 step 2
    println(rangeTurun2.step)
    val rangeNaik2 = 1 .. 100 step 3
    println(rangeNaik2.step)
}