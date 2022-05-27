fun main(args: Array<String>) {
    val a = readln()
    println(a.first().isUpperCase() || a.first().isDigit() && a.toInt() != 0)
}
