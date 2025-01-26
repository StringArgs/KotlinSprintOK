package org.example.lesson2

import kotlin.math.pow

fun main(){
    val initialDeposit = 70_000
    val depositDuration = 20
    val yearPercentage = 16.7
    val convertToDecimal = 100
    val initialAmount = 1
    val finalAmount = initialDeposit * ((initialAmount + (yearPercentage / convertToDecimal)).pow(depositDuration))

    println("%.3f".format(finalAmount))
}