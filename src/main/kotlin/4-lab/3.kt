package org.example.`4-lab`

fun main(){
    val userInput: List<Int> = readln().split(", ").map { it.toInt() }
//    24, -63, 67, -12, 88, 94, -28, 82, 0, 53
    println("${userInput.minOrNull()}, ${userInput.maxOrNull()}")

}