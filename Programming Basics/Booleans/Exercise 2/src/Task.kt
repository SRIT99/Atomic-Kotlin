// Booleans/Task2.kt
package booleansExercise2

fun showAnd(first:Boolean, second:Boolean) {
  if(first&&second){
    println("$first && $second == true")
  }
  else{

    println("$first && $second == false")
  }
}

fun showOr(first: Boolean, second: Boolean) {
  if(first||second){
    println("$first || $second == true")
  }else{
    println("$first || $second == false")
  }
}

fun showTruthTable() {
  var first:Boolean = false
  var second : Boolean = false
  println("showAnd Truth table:")
  do{
    do{
      showAnd(first, second)
      second= !second
    }while(second);
    first = !first
  }while(first);
  println("showOr Truth table:")
  do{
    do{
      showOr(first, second)
      second= !second
    }while(second);
    first = !first
  }while(first);
}

fun main() {
  showTruthTable()
}