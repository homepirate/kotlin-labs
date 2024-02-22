package org.example.`2-lab`


fun main(){
    val num1 = 2
    val num2 = 6
    println("У вас есть числа: $num1 и $num2")
    println("1. Добавить\n2. Отнять\n0. Ничего")

    when(readln().toInt()){
        1 -> println(num1 + num2)
        2 -> println(num1 - num2)
        0 -> return
    }
}