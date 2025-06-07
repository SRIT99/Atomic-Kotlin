// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(content:String) {
    var i = content.length
    var a = 0
    while(a<i) {
        println(content[a])
        a++
    }

}

fun main() {
  displayContent("abc")
}
/* Expected output:
a
b
c
*/