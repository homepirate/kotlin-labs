package org.example.`8-lab`

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import java.io.File


fun saveImageToFile(url: String, imageBytes: ByteArray) {
    val filename = url.substringAfterLast("/")
    val file = File(
        if (filename.endsWith(".jpg"))
            "src/main/kotlin/8-lab/images2/" + filename
        else
           "src/main/kotlin/8-lab/images2/" + filename + ".jpg"
    )
                    file.writeBytes(imageBytes)
}
fun main() {
    val client = HttpClient(CIO)
    runBlocking {
        (1..100).map { i ->
            async {
                var url = "https://cdn2.thecatapi.com/images/$i.jpg"
                val imageBytes = client.get(url).body<ByteArray>()
                saveImageToFile(url, imageBytes)
            }
        }.awaitAll()
    client.close()
    }
}