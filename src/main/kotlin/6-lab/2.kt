package org.example.`6-lab`

fun stringProcessor(processorType: String): (String) -> String {
    return when (processorType) {
        "up" -> { str -> str.uppercase() }
        "low" -> { str -> str.lowercase() }
        "re" -> { str -> str.reversed() }
        else -> { str -> "Unsupported processor type" }
    }
}


fun main(){
    val upperCaseProcessor = stringProcessor("up")
    println(upperCaseProcessor("Hello"))

    val reverseProcessor = stringProcessor("re")
    println(reverseProcessor("Hello"))

}