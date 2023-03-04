package view

object InputView {

    fun inputCarNames(): List<String> {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        return readln().split(",")
    }

    fun inputRaceCount(): Int {
        println("시도할 회수는 몇회인가요?")

        val input = readln()
        validTryCount(input)

        return input.toInt()
    }
}

