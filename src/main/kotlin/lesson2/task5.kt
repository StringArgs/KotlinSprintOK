package org.example.lesson2

import kotlin.math.pow

fun main(){
    val initialDeposit = 70_000
    val depositDuration = 20
    val yearPercentage = 16.7
    val finalAmount = initialDeposit * ((1 + (yearPercentage/100)).pow(depositDuration))

    println("%.3f".format(finalAmount))
}