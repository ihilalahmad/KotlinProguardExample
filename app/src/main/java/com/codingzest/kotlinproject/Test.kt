package com.codingzest.kotlinproject

class Test {
    private val secret = 123
    private var name = "Hilal Ahmad"

    fun greet() {
        println("Hi $name! Enter a number: ")
        readlnOrNull()?.let { guess(it.toInt()) }
    }

    private fun guess(attempt: Int) = println(
        if (attempt == secret) {
            "Correct!"
        } else {
            "Nope!"
        }
    )
}