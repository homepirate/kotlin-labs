package org.example.`5-lab`

fun main(){
    println(sale(100, 70))
    println(sale(1200, 30))

}

fun sale(price: Int, disc: Int): String{
    val result = price - (price * disc / 100)
    return "%.2f".format(result.toDouble())
}