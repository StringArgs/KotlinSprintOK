package org.example.lesson1

fun main(){
    val seconds = 6480
    val hours = seconds / (SAXAGESIMAL_VALUE * SAXAGESIMAL_VALUE)
    val remainSecondsAfterHours = seconds % (SAXAGESIMAL_VALUE * SAXAGESIMAL_VALUE)
    val minutes = remainSecondsAfterHours / SAXAGESIMAL_VALUE
    val remainSeconds = remainSecondsAfterHours % SAXAGESIMAL_VALUE

    println("%02d:%02d:%02d".format(hours, minutes, remainSeconds))
}

const val SAXAGESIMAL_VALUE = 60