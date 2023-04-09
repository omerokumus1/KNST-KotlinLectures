fun main() {
    //     - Verilen bir sayının tek mi çift mi olup olmadığını bulan programı yaz
    // Çift sayı: 2 ile tam bölünebiliyorsa çifttir.
    val number = 23
    val ikiyeBölümündenKalan = number % 2
    // ==, <=, >=, <, >, != -> karşılaştırma operatörleridir, daima Boolean sonuç verir
    val ciftMi = ikiyeBölümündenKalan == 0
    if (ciftMi) {
        println("$number çift sayıdır")
    } else {
        println("$number tek sayıdır")
    }

//    if (ciftMi) println("$number çift sayıdır") else println("$number tek sayıdır")

//    if (ciftMi) println("$number çift sayıdır")
//    else println("$number tek sayıdır")


    }