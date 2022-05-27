const val WO = 20
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    print(a + b == WO || b + c == WO || c + a == WO)
}
