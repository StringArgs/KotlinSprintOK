package org.example

fun main(){
    /* Я использовал переменные типа String так как не знаю как проинициализировать
    * числовую переменную с ведущим нулем.
     */
    val year = "1961"
    var hour = "9"
    var minute = "07"
    println(year)
    println(hour)
    println(minute)
    hour = "10"
    minute = "55"
    println("$hour:$minute")
}
