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
    val kütle = readln().toDoubleOrNull()
    println("Boy (m): ")
    val boy = readln().toDoubleOrNull()
    if (kütle == null) {
        println("Kütle değeri sayı olmalı")
    } else if (boy == null) {
        println("Boy değeri sayı olmalı")
    } else {
        println("Girilen kütle: $kütle")
        println("Girilen boy: $boy")
        val vki = kütle / (boy * boy)
        println("VKI: $vki")
        if (vki < 18.5) {
            println("Underweight")
        } else if (18.5 <= vki && vki < 25) { // 18.5 ≤ BMI < 25.0
            println("Normal")
        } else if (25 <= vki && vki < 30) {
            println("Overweight")
        } else {
            println("Obese")
        }
    }

//    if (kütle != null && boy != null) {
//        // işlemler yapılabilir
//    } else {
//        println("Boy ve kütle sayı formatında olmalı")
//    }


//    if (kütle != null && boy != null) {
//        // işlemler yapılabilir
//    } else if (kütle == null) {
//        println("kütle sayı formatında olmalı")
//    } else {
//        println("boy sayı formatında olmalı")
//    }


}