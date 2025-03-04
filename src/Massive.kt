fun main(args: Array<String>){
    var items: Array<Int> = arrayOf(5, 7, 12, 4, 1)
    var numbers = listOf(3, 6, 9, 12)
    var user: Map<String, Any> = mapOf("name" to "Bob", "age" to 1, "Sanya" to false)
    val words = mutableListOf("First", "Second", "Third", "Fourth", "Fifth") // mutable позволяет добавлять значения
    println(items.set(0, 45)) // Меняем элемент по индексу 0 и ставим значение 45
    println(items[0]) // Возможность вывода элемента
    println(items.get(1)) // Функция вывода элемента
    println(items.size) // Функция размера массива
    //forMassive(items)
    forEachMassive(items)
    indexMassive(items)
}

fun forMassive(items: Array<Int>){
    for(el in items){
        println(el)
    }
}

fun forEachMassive(items: Array<Int>){
    items.forEach { el ->
        println(el)
    }
}

fun indexMassive(items: Array<Int>){
    items.forEachIndexed(){index, el ->
        println("$el с индексом $index")
    }
}