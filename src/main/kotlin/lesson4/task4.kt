package org.example.lesson4

fun main(){
    val dayOfTraining = 5
    val hands: Boolean = dayOfTraining % 2 !== 0
    val legs: Boolean = dayOfTraining % 2 == 0
    val back: Boolean = dayOfTraining % 2 == 0
    val abs: Boolean = dayOfTraining % 2 !== 0

    println("""|Упражнения для рук:    $hands
        |Упражнения для ног:    $legs
        |Упражнения для спины:  $back
        |Упражнения для пресса: $abs""".trimMargin())
}