package org.example.lesson4

fun main(){
    val cargo1Weight = 42
    val cargo1Volume = 0
    val cargo2Weight = 50
    val cargo2Volume = 80
    val cargo3Weight = 0
    val cargo3Volume = 100

    println("Груз с весом $cargo1Weight кг и объемом $cargo1Volume л соответствует категории" +
            " 'Average': ${cargo1Weight > AVERAGE_CATEGORY_MIN_WEIGHT && cargo1Weight <= AVERAGE_CATEGORY_MAX_WEIGHT && cargo1Volume < AVERAGE_CATEGORY_MAX_VOLUME}")
    println("Груз с весом $cargo2Weight кг и объемом $cargo2Volume л соответствует категории" +
            " 'Average': ${cargo2Weight > AVERAGE_CATEGORY_MIN_WEIGHT && cargo2Weight <= AVERAGE_CATEGORY_MAX_WEIGHT && cargo2Volume < AVERAGE_CATEGORY_MAX_VOLUME}")
    println("Груз с весом $cargo3Weight кг и объемом $cargo3Volume л соответствует категории" +
            " 'Average': ${cargo3Weight > AVERAGE_CATEGORY_MIN_WEIGHT && cargo1Weight <= AVERAGE_CATEGORY_MAX_WEIGHT && cargo3Volume < AVERAGE_CATEGORY_MAX_VOLUME}")
}

const val AVERAGE_CATEGORY_MAX_WEIGHT = 100
const val AVERAGE_CATEGORY_MIN_WEIGHT = 35
const val AVERAGE_CATEGORY_MAX_VOLUME = 100