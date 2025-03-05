fun main(args: Array<String>){
    var items =5
    while(items > 0){
        println(items)
        items--
    }

    do {
        println("Items: $items")
    } while (items == 5)

    for (i in 0..10 step 2){
        println(i)
    }

    for(el in 'a'..'y' step 2) {
        println(el)
    }
}