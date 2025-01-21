package org.example.lesson2

fun main(){
    val person1Score = 3
    val person2Score = 4
    val person3Score = 3
    val person4Score = 5
    val allScores = ((person1Score + person2Score + person3Score + person4Score).toDouble() / 4)

    println("%.2f".format(allScores))
}