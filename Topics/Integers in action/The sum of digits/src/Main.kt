const val BASE_TEN = 10

fun Int.getNumbers(): List<Int> {
    var value = this
    val numbers = mutableListOf<Int>()
    while (value > 0) {
        numbers.add(value % BASE_TEN)
        value /= BASE_TEN
    }
    return numbers
}

fun main() {
    println(readln().toInt().getNumbers().sum())
}
