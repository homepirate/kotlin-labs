package org.example.`3- lab`

fun main(){
    var i = 5
    var sum = 0
    while (i <= 57){
        if ((i != 34) and (i != 46) and (i != 52)){
            sum += i
        }
        i += 1
    }
    println(sum)
}