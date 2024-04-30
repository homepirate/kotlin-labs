package org.example.`7-lab`

import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*


fun main(): Unit = runBlocking {
    launch {
        while (true) {
            val sdf = SimpleDateFormat("HH:mm:ss")
            println(sdf.format(Date()))
            delay(1000L)
        }
    }
}