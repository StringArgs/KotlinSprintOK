package org.example

fun main(){
    val seconds = 6480
    val hours = seconds / 3600
    val remainSecondsAfterHours = seconds % 3600
    val minutes = remainSecondsAfterHours / 60
    val remainSeconds = remainSecondsAfterHours % 60
    println("%02d:%02d:%02d".format(hours, minutes, remainSeconds))

}

/*
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */