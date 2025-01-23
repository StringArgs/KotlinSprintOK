package org.example.lesson2

fun main(){
    val crystallineOre = 7
    val ironOre = 11
    val setBuffBonus = 20
    val toDecimal = 100
    val crystallineOreBonus = crystallineOre * setBuffBonus / toDecimal
    val ironOreBonus = ironOre * setBuffBonus / toDecimal

    println("Iron ore buff bonus: $ironOreBonus")
    println(("Crystalline ore buff bonus: $crystallineOreBonus "))
}