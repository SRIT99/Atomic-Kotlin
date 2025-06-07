// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var i = 0
 var summation = 0
  while (i<=number){
   summation = summation+i
    i++
  }
  return summation
}

fun main() {
  println(sum(10))  // 55
}