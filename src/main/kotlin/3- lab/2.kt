package org.example.`3- lab`

import kotlin.random.Random

fun main(){
    val randomNumber = Random.nextInt(1, 10)
    do {
        print("Введите число: ")
        var num = readln().toInt()
    }
        while (num != randomNumber)

        println("Вы угадали!")
}