package org.example.lesson3

fun main(){
    val multiplicand: Int = readln().toInt()
    val multiplier = listOf(1,2,3,4,5,6,7,8,9)
    for(i in multiplier){
        println("$multiplicand x $i = ${multiplicand * i}")
    }
}