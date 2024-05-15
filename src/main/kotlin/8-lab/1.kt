package org.example.`8-lab`

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.http.ContentDisposition.Companion.File
import io.ktor.util.reflect.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.io.File

suspend fun main(){
//   val key = "live_1Yvqrk9AzZ85icidjcbnev32N5ZTrBTGAm8n2SFpMGYMalNk57b1VDr0mO36FtYQ"
//    val url = "https://api.thecatapi.com/v1/images/search?api_key=${key}";
    val client = HttpClient(CIO)


    val job = CoroutineScope(Dispatchers.Default).launch {
        val images = (1..100).map { i ->
            async {
                client.get("https://cdn2.thecatapi.com/images/$i.jpg").body<ByteArray>()
            }
        }.map { it.await() }
        images.forEachIndexed{i, image -> File("src/main/kotlin/8-lab/images/image${i+1}.jpg").writeBytes(image)
        }
    }
    job.join()
}