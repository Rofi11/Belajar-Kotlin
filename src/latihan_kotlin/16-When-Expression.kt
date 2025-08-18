package latihan_kotlin

fun main() {
    var finalExam = "A"

//    1. When biasa
    when (finalExam) {
//       pakai {} jika didalam nya pingin ada beberapa perintah
        "A" -> {
            println("Amazing")
        }
//      tapi jika pingin singkat bisa seperti ini
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        "E" -> println("Try Again Next Year")
        else -> println("Ups")
    }

//   2. Multiple Option / grouping
    when (finalExam) {
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf, Anda Tidak Lulus")
        }
    }

//   3. When Expression In
    val passValues : Array<String> = arrayOf("A", "B", "C")
    finalExam = "E"
    when (finalExam) {
        in passValues -> println("Pass")
        // bisa pakai !in / else
        !in passValues -> println("Try Again")
    }

//    4. When expression is
    val name = "eko"
    when(name){
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

//   5. When sebagai pengganti if else
    val examValue = 90
    when {
        examValue > 90 -> println("Luar biasa")
        examValue > 80 -> println("kerja bagus")
        examValue > 60 -> println("Cukup Baik")
        else -> println("Ngulang tahun depan")
    }
}