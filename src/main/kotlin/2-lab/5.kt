package org.example.`2-lab`


fun main(){
    val num_1 = readln().toInt()
    val num_2 = readln().toInt()
    val num_3 = readln().toInt()

    if (num_1 == num_2 || num_1 == num_3 || num_2 == num_3){
        println("Ошибка")
        return
    }

    val max_ = maxOf(num_1, num_2, num_3)
    val min_ = minOf(num_1, num_2, num_3)

    val res = num_1 + num_2 + num_3 - min_ - max_

    println(res)
}