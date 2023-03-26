fun main() {
    /*
        - Vize, final ve ödev notları verilen bir öğrencinin verilen vize/final/ödev ağırlıklarına göre ortalamasını
        hesaplayan ve verilen baraja göre dersi geçip geçmediğini söyleyen programı yaz.
        Vize %30, Final %50, Ödev %20, Baraj 45
     */
    val baraj = 55
    val vize = 40
    val final = 30
    val ödev = 80
    val ortalama = vize * 30 / 100.0 + final * 0.5 + ödev * 0.2
    if (ortalama >= baraj) println("Dersi geçtiniz. Ortalamanız $ortalama")
    else println("Dersi geçemediniz. Ortalamanız $ortalama")

}