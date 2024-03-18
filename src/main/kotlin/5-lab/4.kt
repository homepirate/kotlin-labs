package org.example.`5-lab`

fun main(){
    val str: String = "ПРивет! Как дела?  Хорошо"
    println(stringWordsCount(str))

}

fun stringWordsCount(str: String): Int{
    val clean = str.replace(Regex("[^\\p{L}\\s]"), " ").replace(Regex("\\s+"), " ").trim()
    return clean.split(" ").size
}