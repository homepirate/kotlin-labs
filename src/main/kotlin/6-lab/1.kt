package org.example.`6-lab`

fun sumOfSquaredAndDividedByTen(f: (Int) -> Int, g: (Int) -> Int): (Int, Int) -> Int {
    return { num_1, num_2 ->
        val squared = f(num_1)
        val divided = g(num_2)
        squared + divided
    }
}

val square = { number: Int -> number  *  number }
val divide = { number: Int -> number / 10 }

fun main(){
    val finalFunction = sumOfSquaredAndDividedByTen(square, divide)
    println(finalFunction(2, 10))
}