package domain

class Cars(names: List<String>) {

    val value: List<Car>

    init {
        value = names.map { Car(it) }
    }

    fun operateAll() {
        value.forEach(Car::moveOrStay)
    }

    fun findWinners(): List<Car> {
        val winnerPosition = value.maxOf { it.getPosition() }
        return value.filter { it.getPosition() == winnerPosition }
    }
}
