package org.example.`5-lab`

fun main(){
    println(one(1234))
}

fun one(num: Int) : String{
    if (num < 1000){
        return num.toString()
    }
    return num.toString()[0] + "K"
    }