package org.example.`2-lab`


fun main(){
    val num = readln().toInt()

    if (num > 18){
        println("Вам уже все можно")
    }
    else if(num == 18){
        println("Ура, Вам 18 лет!")
    }
    else{
        println("Вы еще слишком молоды")
    }
}