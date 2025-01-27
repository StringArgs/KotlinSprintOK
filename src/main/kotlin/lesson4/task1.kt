package org.example.lesson4

fun main(){
    val reservedTablesJanuary26 = 13
    val reservedTablesJanuary27 = 9
    val tableAvailabilityJanuary26 = reservedTablesJanuary26 < NUMBER_OF_TABLES
    val tableAvailabilityJanuary27 = reservedTablesJanuary27 < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $tableAvailabilityJanuary26\nДоступность столиков на завтра: $tableAvailabilityJanuary27")

}

const val NUMBER_OF_TABLES = 13