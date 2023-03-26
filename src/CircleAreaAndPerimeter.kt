fun main() {
    // - Çember alan ve çevre hesabı yapan program. Formülleri internetten bul
    // A = pi*r*r, r yarıçap
    // Ç = 2*pi*r

//    val pi = 3.14 // Sabit değerler için değişken kullan
    val pi = Math.PI
    val r = 5 // Eğer birden fazla yerde kullanılacaksa değişkene atayıp değişken ile eriş
    val alan = pi * r * r
    val cevre = 2 * pi * r
//    println("r = 4 için Alan: " + alan)
    println("r = $r için Alan: $alan") // string template -> $alan, $r
    println("r = $r için Çevre: $cevre")
}