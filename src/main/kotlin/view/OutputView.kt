package view

import domain.Car
import domain.Cars

private const val DASH = "-"

object OutputView {

    fun printException(e: Exception) {
        println(e.message)
        println()
    }

    fun printResultTitle() {
        println("실행 결과")
    }

    fun printRaceResult(cars: Cars) {
        for (car in cars.value) {
            println("${car.name} : ${DASH.repeat(car.position)}")
        }
        println()
    }

    fun printWinner(winners: List<Car>) {
        println("${winners.joinToString(separator = ", ") { it.name }}가 최종 우승했습니다.")
    }
}
