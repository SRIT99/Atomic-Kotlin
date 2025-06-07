// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Long, minutes: Long, seconds: Long): Long {
val hour:Long = hours*60*60*1000L
    val minute = minutes*60*1000L
    val second = seconds*1000L
    return (hour+minute+second)
}


fun main(){
    println("Enter hour:")
    val hour = readln().toLong()
    println("Enter Minutes and second")
    val minutes = readln().toLong()
    val seconds = readln().toLong()
    val result = convertToMilliseconds(hour, minutes, seconds)
    println(result)

}