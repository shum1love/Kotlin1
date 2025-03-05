fun main(args: Array<String>){
    val alex = User("Gleb", "Gagarsky")

    alex.firstName = "Alexander"
    println(alex.firstName)
    alex.printUser()
}