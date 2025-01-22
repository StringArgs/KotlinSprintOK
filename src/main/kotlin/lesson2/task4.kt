package org.example.lesson2

fun main(){
    val crystallineOre = 7
    val ironOre = 11
    val buffBonus = 20
    val crystallineOreBonus = crystallineOre * buffBonus / 100
    val ironOreBonus = ironOre * buffBonus / 100

    println("Iron ore buff bonus: $ironOreBonus")
    println(("Crystalline ore buff bonus: $crystallineOreBonus"))
}