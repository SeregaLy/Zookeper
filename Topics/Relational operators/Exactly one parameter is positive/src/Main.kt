const val OO = 0
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    print(a > OO && b <= OO && c <= OO || a <= OO && b > OO && c <= OO || a <= OO && b <= OO && c > OO)
}
