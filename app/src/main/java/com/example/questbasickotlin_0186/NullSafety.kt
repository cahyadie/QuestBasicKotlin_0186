package com.example.questbasickotlin_0186

fun nullSafety(){
    // neverNull has String type
    var neverNull: String = "This can't be null"

    //Throws a complier error
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "you can keep a null her e"
    //this is OK
    nullable = null

    //check for null in conditions
    if (neverNull === null){
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    // safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null

    // notNull dosen't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength(neverNull)) // 18
}

fun main() {
    nullSafety()
}






