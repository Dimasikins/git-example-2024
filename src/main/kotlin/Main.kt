fun main(aras: Array<String>) {
    val options = array0f("Камень", "Ножницы", "Бумага")

    val geneChoice = computerChoiceGenerator(options)
    val userChoice = getPlayerChoice(options)
}
fun getPLayerChoice(optionsParam: Array<String>): String {
    print(" Ваедите, один из вариантов ")

    for (item in optionsParam)
        print("$item ")
    println(".")

val userInput = readLine()

    if  (userInput != null && userInput in optionsParam) {
        return userInput
    }
return "todo"
}
fun computerChoiceGenerator (optionsParam: Array<String>) =
    optionsParam[ (Math. random() * optionsParam. size) .toInt()] //8.0 do 1.00