package chap02.section2

// 문자열에 표현식 사용하기

fun main() {
    var a = 1
    val str1 = "a =$a"
    val str2 = "a = ${a + 2}" // 문자열에 표현식 사용

    val special = "\"hello\", I have \$15"
    val special2 = "${'"'}${'$'}9.99${'"'}"

    println("str1: \"$str1\", str2: \"$str2\"")
    println(special)
    println(special2) // "$9.99"


}