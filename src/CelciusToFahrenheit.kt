fun main() {
    /*
    - (Convert Celsius to Fahrenheit) Write a program that converts a Celsius degree in
        a double value to Fahrenheit and displays the result. The formula for the conversion is as follows:
        fahrenheit = (9 / 5) * celsius + 32
        Sample: 43 Celsius is 109.4 Fahrenheit
     */

    val celsius = 101
//    val c = 9/5
//    val b = 32
    val fahrenheit = (9.0 / 5) * celsius + 32
//    (9 / 5) * 50 + 32
    println(fahrenheit)


    // Int Division: Bölünen sayılardan ikiside tam sayı ise ise sonuç tam sayı olur
    println(9/5)
    // Double Division: Bölünen sayılardan en az biri double ise sonuç double olur
    println(9.0 / 5)
    println(9 / 5.0)
    println(9.0 / 5.0)

}