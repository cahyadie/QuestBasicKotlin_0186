package com.example.questbasickotlin_0186

fun contohlist() {
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // menambahkan data ke dalam list Mutable
    shape.add("Circle")
    println(shape)

    // menghapus data dari list Mutable
    shape.remove("Triangle")
    println(shape)

    // menambahkan data di dalam list Mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapeLocked: List<String> = shape
    println(shapeLocked)
}

fun ContohSet() {
    println()
    println("=== Set ===")

    // Set Mutable
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam set Mutable
    shape.add("Rectangle")
    println(shape)

    // Menghapus data dari set Mutable
    shape.remove("Circle")
    println(shape)

    // Set Read-Only
    val shapeLocked: Set<String> = shape
    println(shapeLocked)
}

fun ContohMap() {
    println()
    println("=== Map ===")
    // Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    // Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    // Map Read-Only
    val shapeLocked: Map<String, Int> = shape
    println(shapeLocked)
}

fun main() {
    contohlist()
    ContohSet()
    ContohMap()
}