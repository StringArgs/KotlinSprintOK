package org.example.lesson3

fun main(){
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    var toServer = "$moveFrom-$moveTo;$moveNumber"

    println(toServer)

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber = 2
    toServer = "$moveFrom-$moveTo;$moveNumber"

    println(toServer)
}

