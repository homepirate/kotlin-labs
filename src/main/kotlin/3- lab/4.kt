package org.example.`3- lab`

fun main() {
    var even = 0
    var odd = 0
    val userNum = readln()

    for (i in userNum) {
        when(i) {
            '0' -> continue
            else -> when (i.code % 2) {
                        0 -> even += 1
                        1 -> odd += 1
                    }
        }
    }
    println("Четные: $even, Нечетные: $odd")
}