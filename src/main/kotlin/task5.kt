package org.example

fun main(){
    val seconds = 6480
    val hours = seconds / 3600
    val remainSecondsAfterHours = seconds % 3600
    val minutes = remainSecondsAfterHours / 60
    val remainSeconds = remainSecondsAfterHours % 60

    println("%02d:%02d:%02d".format(hours, minutes, remainSeconds))

}