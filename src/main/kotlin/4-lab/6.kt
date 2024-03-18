package org.example.`4-lab`

fun main(){
    val  userInput: List<Int> = readln().split(", ").map{ it.toInt()}
//    5, 8, 18, 34, 3, 56, 43, 27, 4, 23
    val sra : Double = userInput.sum().toDouble() / userInput.size
    val result = userInput.filter { it > sra }
    println(sra)
    println(result)

}