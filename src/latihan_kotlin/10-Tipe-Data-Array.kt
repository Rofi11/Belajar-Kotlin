package latihan_kotlin

fun main() {
//    membuat array di kotlin dan cara deklare nya
    val members: Array<String> = arrayOf("eko", "joko", "budi")
//    Operasi array
    val eko: String = members[0]
    val joko: String = members.get(1)
    println(eko)

//    data array masih bisa di rubah biarpun menggunakan val, yang tidak di ubah di val adalah variabel nya
    // Operasi untuk merubah nya
    members.set(0, "Ammar")
    members[2] = "Rofi"

    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    println(members[0])
    println(members.size)

//    Array Nullable (bagaimana jika data nya ada yang null)
    val names: Array<String?> = arrayOfNulls(5)
    names[0] = "rofi"
    names[1] = "muhammad"
    names[2] = null
    names[3] = null
    names[4] = "eko"

    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])
    println(names[4])
    println(names.size)

}