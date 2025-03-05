fun printSome(item: String, vararg word: Any) {
    print("$item: ")
    word.forEach { el -> print("$el ") }
    println("")
}

fun main(args: Array<String>) {
    val names = arrayOf("Bob", "Nikitos", "Petrov", 1, true)

    // Способ 1: Передача одиночного аргумента без именованного параметра
    printSome("Some", "Hi")

    // Способ 2: Использование массива с spread-оператором
    printSome(item = "Some", word = *arrayOf("Hi"))

    // Корректный вызов с использованием spread operator
    printSome("Some", *names)

    // Корректный вызов с несколькими аргументами
    printSome("Some", "Hello", "some new")
}