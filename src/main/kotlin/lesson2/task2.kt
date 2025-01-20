package org.example.lesson2

fun main(){

    val permanentEmployeesSalary = 30_000
    val internsSalary = 20_000
    val numberOfPermanentEmployees = 50
    val numberOfInterns = 30
    val totalEmployees = numberOfPermanentEmployees + numberOfInterns
    val permanentEmployeeExpenses = expenses(numberOfPermanentEmployees, permanentEmployeesSalary)
    val internsExpenses = expenses(numberOfInterns, internsSalary)
    val totalExpenses = permanentEmployeeExpenses + internsExpenses
    val salaryArithmeticMean = (permanentEmployeeExpenses + internsExpenses) / totalEmployees

    println(permanentEmployeeExpenses)
    println(totalExpenses)
    println(salaryArithmeticMean)
}

fun expenses(number: Int, salary: Int ): Int{
    return number * salary
}