package org.example.`7-lab`

import kotlinx.coroutines.*


suspend fun calcSumFact(n: Int): Int = coroutineScope {
    var sum = 0
    for (i in 1..n) {
        var result = 1
        for (j in 1..i) {
            result *= j
        }
        sum += result
        delay(1000L)
    }
    sum
}

fun main(): Unit = runBlocking {
    val result = calcSumFact(10)
    println(result)
}
