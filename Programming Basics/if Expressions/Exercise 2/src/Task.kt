// IfExpressions/Task2.kt
package ifExpressionsExercise2

fun abs(number: Int): Int{
  val i = -1
  if(number<0) return(i* number)
  else{
    return number
  }

}

fun main() {
  println(abs(-19))  // 19
}