package org.example.lesson3

fun main(){
    val multiplicationTable: Int = readln().toInt()
    val multiplicationTable1 = listOf(1,2,3,4,5,6,7,8,9)
    for(i in multiplicationTable1){
        println("$multiplicationTable x $i = ${multiplicationTable * i}")
    }
}