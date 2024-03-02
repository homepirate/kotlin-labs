package org.example.`3- lab`

fun main(){
    var sum = 0
    for (i in 1..100){
        when (i % 4){
            0 -> sum += i
            else -> continue
        }
    }
    println(sum)
}