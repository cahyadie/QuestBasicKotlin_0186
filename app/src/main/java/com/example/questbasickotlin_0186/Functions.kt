package com.example.questbasickotlin_0186

fun withoutParameter() {
    println("== WithoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== WithParameter ==")
    println("Hello, $name!")
}

//named argument
//named argument merupakan cara untuk mengenali fungsi dengan meyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name You are $age years old.")
}
