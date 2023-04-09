fun main() {
    /*
    - Vücut Kitle Endeksi hesaplayan ve sonuca göre normal obez vs yazan program. VKI aralıkları aşağıda
            BMI < 18.5 Underweight
            18.5 ≤ BMI < 25.0 Normal
            25.0 ≤ BMI < 30.0 Overweight
            30.0 ≤ BMI Obese

        formül: VKI = kütle / (boy*boy)
     */
    // Kullanıcıdan input aldıktan sonra bu input daima kontrol edilir. Yanlış input girilmesi durumunda program ya akışı
    // sonlandırır ya da tekrar input ister.
    println("Kütle (kg): ")
    val kütle = readln().toDouble()
//    println("Girilen kütle: $weight")

//    if (kütle == null) {
//        println("Sayı giriniz")
//    } else {
//        println("sayı girildi")
//    }

    println("Boy (m): ")
    val boy = readln().toDouble()
    val vki = kütle / (boy * boy)

    println("VKI: $vki")
    if (vki < 18.5) {
        println("Underweight")
    } else if (18.5 <= vki && vki < 25) {// 18.5 ≤ BMI < 25.0
        println("Normal")
    } else if (25 < vki && vki < 30) {
        println("Overweight")
    } else {
        println("Obese")
    }

}
