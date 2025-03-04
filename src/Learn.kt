fun main(args: Array<String>){
    var word: String? = null
    var isHasCar = true
    var byke = true

    if(word == null || byke){ // или
        println("Переменная равна null")
        println("It is not OK")
        if(isHasCar == true){
            println("Car");
        }
    }else if(word == "Hello" && !byke){ // и
        println("Переменная равна Hello")
    }else{
        println("Wanna eat cheeps")
    }

    val number = 5
    when(number){
        null -> print("Переменная равна null")
        10 -> print("Переменная равна 10")
        5 -> print("Переменная равна 5")
        else -> print("WRONG")
    }

    var res: Int = 0
    if(number > 2)
        res = 1
    else
        res = 2
    // Аналог
    var res2: Int = if(number > 3) 1 else 0

    // Сокращённая форма написания when
    val words = when(number){
        null -> "nothing"
        else -> number
    }
}