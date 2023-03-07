package domain

class Cars(names: List<String>) {

    val value: List<Car> = names.map { Car(it) }

    fun operateAll() {
        value.forEach(Car::moveOrStay)
    }

    fun findWinners(): List<Car> {
        val winnerPosition = value.maxOf { it.position }
        return value.filter { it.position == winnerPosition }
    }
}
