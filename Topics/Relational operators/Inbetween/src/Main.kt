fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    print(a >= b && a <= c || a <= b && a >= c)
}
