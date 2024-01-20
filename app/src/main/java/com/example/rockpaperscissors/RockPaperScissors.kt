package com.example.rockpaperscissors

fun main(){

    var computerChoice = ""
    var playerChoice = ""

    println("Piedra, Papel or Tijera? Enter your choice!")
    playerChoice = readln(); //leer lo que haya puesto y guardarlo en la variable
    println("Tu elección: $playerChoice")
    val randomNumber = (1..3).random() //random function en un rango de entre 1 y 3

    when (randomNumber) {
        1 -> {
            computerChoice = "Piedra"
        }
        2 -> {
            computerChoice = "Papel"
        }
        3 -> {
            computerChoice = "Tijeras"
        }
    }

    println("Elección del ordenador: $computerChoice")

    val winner = when {
        playerChoice == computerChoice -> "Empate"
        playerChoice == "Piedra" && computerChoice == "Tijeras" -> "¡Has ganado!"
        playerChoice == "Papel" && computerChoice == "Piedra" -> "¡Has ganado!"
        playerChoice == "Tijeras" && computerChoice == "Papel" -> "¡Has ganado!"
        else -> "Has perdido"
    }

    println(winner)
}