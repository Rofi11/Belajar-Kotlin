package latihan_kotlin

fun main() {
    var firstName: String = "Eko"
    var lastName : String = "Khannedy"
//    penggabungan dengan .trimmargin(), bisa mengubah karakter nya tidak perlu pipw
    var address : String = """
        |Address 1, RT 01, RW 01
        |Kabupaten Subang
        |Jawa Barat
        |Indonesia
    """.trimMargin()
//    contoh 2, tidak menggunakan pipe
    var address2 : String = """
        > Address 2 RT 01, RW 01
        > Kabupaten Subang
        > Jawa Barat
        > Indonesia
    """.trimMargin(">")
//    penggabungan dengan .trimIndent() --> default nya
    var address3 : String = """
        Adress 3, RT 012, RW 012
        Kabupaten Subang
        Jawa Barat
        Indonesia
    """.trimIndent()
// menggabungkan String/ contatenation string
//    cara 1 -> kurang rekomendasi
    var fullName : String = firstName + " " + lastName
//    cara 2 dengan string template -> rekomendasi
    var fullName2 : String ="$firstName $lastName"
//    cara template ekspresi yanglebih kompleks nya
    var desc: String = "$fullName2 length = ${fullName2.length}"

    println(firstName)
    println(lastName)
    println(address)
    println(address2)
    println(address3)
    println(fullName)
    println(fullName2)
    println(desc)
}
