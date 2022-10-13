package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}") // str1 : Hello, str2 : World => false
    println("str1 === str3: ${str1 === str3}") // str1 : Hello, str3 : Hello => true

    // str1과 str3은 같은 문자열 => 즉, 새로운 스택에 저장하는 것보다 이미 저장된 값을 활용
    // 코틀린은 힙 영역의 String Pool 이라는 공간에 문자열을 저장해두고 참조하도록 만든다.
    // 결과적으로 str1, str3의 참조주소는 동일하므로 참조 비교를 위해 === 연산자를 사용하면 true가 반환된다.
}