package com.example.questbasickotlin_0186

// conditional Expression
// Conditional expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// conditional expresssion menggunakan if-else, when, dan try-catch
fun ConditionalStatement() {
    println("=== Conditional Expression ===")

    //if-else
    val number = 10
    if (number > 0){
        println("Positive number")
    } else {
        println("Negative number")
    }

    //When
    val day = 1
    when (day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Satuday")
        else -> println("Invalid day")
    }

    //try-catch
    val value = "10"
    try{
        val result = value.toInt()
        println("Result: $result")
    }   catch (e: NumberFormatException){
        println("Invalid Number")
    }
}

