const val AA = 10
const val BB = 20
const val CC = 15
const val DD = 25
fun main() {
    val a = readln().toInt()
    val b = readln().toBoolean()
    print(b == false && a >= AA && a <= BB || b == true && a >= CC && a <= DD)
}
