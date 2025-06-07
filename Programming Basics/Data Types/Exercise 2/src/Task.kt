// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val a = int+double
  val c = string+character
  val x = string+int
  val y = string+double
  val z = string+boolean
  val char1 = character+ int

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
  // some examples
  //val a= int+string
  //val i = int+boolean
  //val b= int+character
  //val c = double+string
  //val d = double + character
  //val e = double+boolean
 // var char2 = character + double
//  val char3 = character+boolean
}