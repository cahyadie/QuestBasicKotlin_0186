package com.example.questbasickotlin_0186

class Motor()

class Contact(val id: Int, email: String)

fun main(){
    val contact = Contact(1, "mary@gmail.com")

    // Prints the value of the property: email
    println(contact.email)
    
    // Updates the value of the propert: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)


}

