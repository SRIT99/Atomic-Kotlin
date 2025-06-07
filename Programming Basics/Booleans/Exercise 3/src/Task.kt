// Booleans/Task3.kt
package booleansExercise3

import trueOrFalse

fun and(b1: Boolean, b2: Boolean): Boolean
  {
    if (b1){
      if(b2){
        return true
      }
      else{
        return false
      }
    }
    else{
     return false
    }
  }

fun or(b1: Boolean, b2: Boolean): Boolean
  {
    if(b1)
      return true
    else{
      if(b2)
        return true
      else
        return false
    }
  }

fun main() {
  println(and(true, true)) // true
  println(or(true, false)) // true
}