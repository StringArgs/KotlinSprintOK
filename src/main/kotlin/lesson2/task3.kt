package org.example.lesson2

fun main(){
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    var tripTimeMinutes = 457
    val tripTimeHours = 457 / SAXAGESIMAL_VALUE
    tripTimeMinutes %= SAXAGESIMAL_VALUE
    var arrivalMinutes = departureTimeMinutes + tripTimeMinutes
    val arrivalHours = departureTimeHours + tripTimeHours + arrivalMinutes / SAXAGESIMAL_VALUE
    arrivalMinutes %= SAXAGESIMAL_VALUE

    println("%02d:%02d".format(arrivalHours, arrivalMinutes))
}

const val SAXAGESIMAL_VALUE = 60