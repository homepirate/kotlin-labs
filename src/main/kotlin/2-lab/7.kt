package org.example.`2-lab`


fun main(){
    val num_1 = readln().toInt()
    val num_2 = readln().toInt()
    val res = if (num_1 % 2 == 0 && num_2 % 2 == 0) true else false
    println(res)
}