fun main() {
    /*
    --> Rastgele Ay
        Ekrana rastgele ay yazdıran program yaz;
            a. when ile
            b. if else ile
     */
    val range = 1..12 // 1,2,3,4,5,6,7,8,9,10,11,12
    val randomNumber = range.random()
    when (randomNumber) {
        1 -> println("1.Ocak")
        2 -> println("2.Şubat")
        3 -> println("3.Mart")
        4 -> println("4.Nisan")
        5 -> println("5.Mayıs")
        6 -> println("6.Haziran")
        7 -> println("$randomNumber.Temmuz")
        8 -> println("$randomNumber.Ağustos")
        9 -> println("$randomNumber.Eylül")
        10 -> println("$randomNumber.Ekim")
        11-> println("$randomNumber.Kasım")
        12 -> println("$randomNumber.Aralık")
    }
}