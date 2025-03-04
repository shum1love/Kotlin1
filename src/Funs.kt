fun sayHello(){
    println("Hello Vitalik")
}

fun dollar(first:String, number: Int){
    print("$first - $number")
}

fun add9(x: Int, y: Int): Int {
    return x + y
}


fun main(args: Array<String>){
    sayHello()
    dollar("Hello", 33)
    val result = add9(5, 6)
    println(result)
}