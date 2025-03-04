fun main(args: Array<String>) {
    println("Hello World!")
    val age: Int = 23
    println("Переменная: $age")

    var name: String = "Sanya"
    var symbol: Char = 's'
    var isTrue: Boolean = false
    var num: Float = 4.5f
    var num2: Double = 4.12345678912345

    // var - переменную можно переприсвоить
    // val - переменную нельзя переприсвоить

    var message: String? = null
    math()
}

// Глобальные переменные создаются вне классов
var number_33 = 33
var number_5 = 5

fun math(){
    var res = number_33 + number_5
    var res2 = number_33 - number_5
    var res3 = number_33 * number_5
    var res4 = number_33 / number_5
    var res5 = number_33 % number_5 // остаток при делении

    println("Сложение: $res")

}
