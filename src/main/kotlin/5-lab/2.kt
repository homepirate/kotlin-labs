package org.example.`5-lab`

fun main(){
    println(1.years())
    println(11.years())
    println(33.years())
    println(111.years())
    println(52.years())
}

fun Int.years(): String {
    return when {
        this % 10 == 1 && this % 100 != 11 -> "$this год"
        this % 10 in 2..4 && this % 100 !in 12..14 -> "$this года"
        else -> "$this лет"
    }
}