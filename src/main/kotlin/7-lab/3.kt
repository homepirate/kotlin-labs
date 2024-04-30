package org.example.`7-lab`

import kotlin.random.Random
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun randomTask(index: Int): Pair<Int, Boolean> {
    val randomNumber = Random.nextInt(1, 100)
    val isEven = randomNumber % 2 == 0
    return Pair(index, isEven)
}

fun main(): Unit = runBlocking {
    val results = mutableMapOf<Int, Boolean>()

    val executionTime = measureTimeMillis {
        repeat(100000) { index ->
            val job = launch {
                val (indexResult, isEven) = randomTask(index)
                results[indexResult] = isEven
            }
            job.join()
        }
    }

    val successCount = results.count { it.value }
    println("Количество успешно выполненных задач: $successCount")
    println("Общее время выполнения: $executionTime мс")
}





