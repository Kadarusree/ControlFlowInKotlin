fun main(args : Array<String>){
    var num1 : Int = 7
    var num2 : Int = 6
    if(num1>num2)
        println("$num1 is greater than $num2")
    else
        println("$num2 is greater than $num1")

    //In kotlin if else is not just a condition we can use it as an expression which returns something
    var result = 0
    result = if(num1 > 2) num1
    else num2

    println("$result is bigger than other")

    //Now lets comapre string with if else

    var string1 : String = "Kotlin"
    var string2 : String = "kotlin"
    //In Java we use .equals method or equalsIngnorecase
    //Lets use same with Kotlin
    if(string1.equals(string2)) println("Same")
    else println("Not Same")   //output will be Not same because of case difference
    //to ignore case use .eqauls(string, isIgnoreCase) method
    if (string1.equals(string2, true)) println("Same") //This case it is Same
    else println("Not Same")

    if(string1 == string2) println("Same")
    else println("Not Same")

}