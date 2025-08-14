package latihan_kotlin

fun main() {
    val finalExam = 80
    val attedant = 75
    val extraPoint = 70

//    mencari nilai boolean dengan operator logika
    val passFinalExam = finalExam > 75
    val passAttedant = attedant > 80
    val pasExtraPoint = extraPoint > 65

//    melakukan perbandingan akhir dengan operator boolean utk tau hasil akhir dari ke 2 nilai boolean
    val pass = passFinalExam && passAttedant && pasExtraPoint
//    cara perbandingan boolean selalu di mulai dari 2 nilai terkiri
//    val pass = ((passFinalExam && passAttedant) && pasExtraPoint)

    if(!pass){
        println("Kamu tidak Lulus")
    } else {
        println("Kamu lulus")
    }

}