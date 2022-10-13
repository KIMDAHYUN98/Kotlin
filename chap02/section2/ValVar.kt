package chap02.section2

fun main() {
    val number = 10 // number 변수는 int 형으로 추론
    var language = "Korean"
    val secondNumber: Int = 20
    language = "English"

    var num: Double = 0.1

    println("number: $number")
    println("language : $language")
    println("secondNumber : $secondNumber")

    for(x in 0..999) {
        num += 0.1
    }

    println(num)
}