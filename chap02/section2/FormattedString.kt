package chap02.section2

fun main() {
    // 형식화된 다중 문자열 출력해보기
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotiln"
        println(a + num) // num의 값은 $num
        """
    println(formattedString)

    // 자료형에 별명 붙이기
    // typealias Username = String  => typealias : 특정 자료형이나 클래스 등에 별명을 붙이면 명확하게 용도를 나타낼 수 있음
    // val user: Username = "Kildong"
}