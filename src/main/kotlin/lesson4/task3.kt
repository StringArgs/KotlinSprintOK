package org.example.lesson4

fun main(){
    val sunnyWeather: Boolean = true
    val isTentOpen: Boolean = true
    val humidityLevel: Int = 20
    val humidityRequiredLevel: Int = 20
    val season: String = "зима"
    val unacceptableSeason: String = "зима"
    val acceptableConditions: Boolean = sunnyWeather && isTentOpen && (humidityLevel == humidityRequiredLevel) && (season !== unacceptableSeason)

    println("Благоприятные ли условия сейчас для роста бобовых? $acceptableConditions")
}