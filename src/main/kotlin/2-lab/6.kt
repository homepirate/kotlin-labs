package org.example.`2-lab`


fun main(){
    val num_1 = readln().toInt()
    val num_2 = readln().toInt()

    val res = if (num_2 > num_1) "Ваша прибыль составила: ${num_2 - num_1}"
    else "Ваши убытки составили: ${num_1 - num_2}"
    println(res)
}