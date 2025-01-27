package org.example.lesson3

fun main(){
    var personFirstName = "Татьяна"
    var personLastName = "Андреева"
    var personPatronymic = "Сергеевна"
    var personAge = 20

    println("$personLastName $personFirstName $personPatronymic, $personAge")

    personFirstName = "Татьяна"
    personLastName = "Сидорова"
    personPatronymic = "Сергеевна"
    personAge = 22

    println("$personLastName $personFirstName $personPatronymic, $personAge")
}