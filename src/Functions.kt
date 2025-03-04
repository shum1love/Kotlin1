fun printSome(item: String, vararg word: Any){
    word.forEach{ el -> print("$el")}
    println("")
}

fun main(args: Array<String>){
    var names = arrayOf("Bob", "Nikitos", "Petrov, 1, true")
    printSome("Some")
    printSome("Some", *names)
    printSome("Some", "Hello", "some new")
}