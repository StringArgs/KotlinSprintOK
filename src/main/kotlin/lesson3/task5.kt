package org.example.lesson3

fun main(){
    val getFromServer = "D2-D4;0"
    val (moves, moveNumber) = getFromServer.split(";")
    val (moveFrom, moveTo) = moves.split("-")

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}