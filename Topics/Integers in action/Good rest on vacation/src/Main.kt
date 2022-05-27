import java.util.*
val scan = Scanner(System.`in`)

fun main() {
    val day: Int = scan.nextInt()
    print(day * scan.nextInt() + scan.nextInt() * 2 + scan.nextInt() * (day - 1) )
}
