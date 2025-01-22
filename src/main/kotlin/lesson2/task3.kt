package org.example.lesson2

fun main(){
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    var tripTimeMinutes = 457
    val tripTimeHours = 457/60
    tripTimeMinutes %= 60
    var arrivalMinutes = departureTimeMinutes + tripTimeMinutes
    val arrivalHours = departureTimeHours + tripTimeHours + arrivalMinutes / 60
    arrivalMinutes %= 60

    println("%02d:%02d".format(arrivalHours, arrivalMinutes))
}
