package org.example.`7-lab`

import kotlinx.coroutines.*

suspend fun executeWithTimeout(block: suspend () -> Unit) {
    withTimeoutOrNull(1000L) {
        block()
    } ?: println("Too long body execution")
}



fun main() = runBlocking {
    executeWithTimeout {
        delay(500L)
        println("Okey")
    }

    executeWithTimeout {
        delay(1500L)
        println("Not Okey")
    }
}
