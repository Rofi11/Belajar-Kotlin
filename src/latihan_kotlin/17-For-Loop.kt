package latihan_kotlin

fun main() {
// 1. Perulangan untuk Array
    var array : Array<String> = arrayOf("Eko", "Kurniawan", "Khannedy")

    var total = 0
    for (name in array){
        println(name)
        total++
    }

    println("Total perulangan = $total")

// 2. Perulangan untuk Range
    for (value in 0..10 step 2) {
        println(value)
    }

// 3. Penggabungan antara range dan Array
    val ukuranArray = array.size - 1 // utk mendapatkan panjang data array
    for (i in 0..ukuranArray){
        println("Index $i = ${array.get(i)}")
    }
}