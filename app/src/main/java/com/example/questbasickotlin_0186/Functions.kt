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

//default parameter value
//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name:String = "Indra", age: Int){
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name You are $age years old.")
}

fun witReturn(panjang : Int, lebar : Int) {
    return println(panjang*lebar)
}

fun main(){
    withoutParameter()
    withParameter("Jhon")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}
