fun main() {
    /*
    - Rock, paper, scissor
        Rastgele taş, kağıt, ya da makas seçen bir program yaz.
        Kullanıcıdan taşi kağıt, makas için girdi iste. Kullanıcının kazanıp
        kazanmadığını ekrana yaz.
            Örn-1;
                Taş, kağıt, makas: taş
                Çıktı: Bilgisayar kağıt seçmişti. Kaybettiniz

            Örn-2;
                Taş, kağıt, makas: makas
                Çıktı: Bilgisayar kağıt seçmişti. Kazandınız

            Örn-3;
                Taş, kağıt, makas: makas
                Çıktı: Bilgisayar da makas seçmişti. Berabere


        Part-2: Kullanıcı taş için 0, kağıt için 1, makas için 2 girsin.
            Örn-1;
                Taş (0), kağıt (1), makas (2): 0
                Çıktı: Bilgisayar kağıt seçmişti. Kaybettiniz
     */

    // Part 1- Rastgele taş, kağıt, ya da makas seçen bir program yaz.
    val range = 1..3
    val computer = range.random()
    /*when (computer) {
        1 -> println("Taş")
        2 -> println("Kağıt")
        3 -> println("Makas")
    }*/

    // Part 2- Kullanıcıdan taşi kağıt, makas için girdi iste
    println("Taş (1), Kağıt (2), Makas (3): ")
    val user = readln().toInt()
    /*when (user) {
        1 -> println("Taş")
        2 -> println("Kağıt")
        3 -> println("Makas")
    }*/

    // Part 3- Kullanıcının kazanıp kazanmadığını ekrana yaz.
    /*if (user == 1 && computer == 1) {
        print("Taş vs. Taş. Berabere!")
    } else if (user == 1 && computer == 2) {
        println("Taş vs. Kağıt. Kaybettiniz!")
    } else if (user == 1 && computer == 3) {
        println("Taş vs. Makas. Kazandınız!")
    } else if (user == 2 && computer == 1) {
        print("Kağıt vs. Taş. Kazandınız!")
    } else if (user == 2 && computer == 2) {
        println("Kağıt vs. Kağıt. Berabere!")
    } else if (user == 2 && computer == 3) {
        println("Kağıt vs. Makas. Kaybettiniz!")
    } else if (user == 3 && computer == 1) {
        println("Makas vs. Taş. Kaybettiniz!!")
    } else if (user == 3 && computer == 2) {
        println("Makas vs. Kağıt. Kazandınız!")
    } else if (user == 3 && computer == 3) {
        println("Makas vs. Makas. Berabere!")
    }*/

    // Refactor
    if (user == 1) { // User taş seçti
        if (computer == 1) { // Nested-if, iç içe if
            print("Taş vs. Taş. Berabere!")
        } else if (computer == 2) {
            println("Taş vs. Kağıt. Kaybettiniz!")
        } else {
            println("Taş vs. Makas. Kazandınız!")
        }
    } else if (user == 2) { // User Kağıt seçti
        when (computer) {
            1 -> print("Kağıt vs. Taş. Kazandınız!")
            2 -> println("Kağıt vs. Kağıt. Berabere!")
            3 -> println("Kağıt vs. Makas. Kaybettiniz!")
        }
    } else { // User makas seçti
        when (computer) {
            1 -> println("Makas vs. Taş. Kaybettiniz!!")
            2 -> println("Makas vs. Kağıt. Kazandınız!")
            3 -> println("Makas vs. Makas. Berabere!")
        }
    }
}