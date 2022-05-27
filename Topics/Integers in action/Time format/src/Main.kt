const val MS_IN_S = 100
const val SEC_IN_MIN = 60
const val MIN_IN_HRS = 60
const val HRS_IN_DAY = 24
const val SEC_IN_HRS = SEC_IN_MIN * MIN_IN_HRS
const val SEC_IN_DAY = SEC_IN_HRS * HRS_IN_DAY
fun main() {
    val totalSeconds = System.currentTimeMillis() / MS_IN_S // dont change this line
    val secInCurrentDay = totalSeconds % SEC_IN_DAY
    val currentHour = secInCurrentDay / SEC_IN_HRS
    val currentMin = secInCurrentDay % SEC_IN_HRS / SEC_IN_MIN
    val currentSec = secInCurrentDay % SEC_IN_HRS % SEC_IN_MIN
    
    println("$currentHour:$currentMin:$currentSec")
}
