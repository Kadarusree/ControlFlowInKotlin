fun main(){
    /*Kotlin, when expression is a conditional expression which returns the value. Kotlin,
    when expression is replacement of switch statement. Kotlin,
    when expression works as a switch statement of other language (Java, C++, C).*/
    var num = 0
    println("Enter any Number")
    num = Integer.parseInt(readLine())
    when(num){
        1 -> println("Number is $num")
        2 -> println("Number is $num")
        3-> println("Number is $num")
        4 -> println("Number is $num")
        5-> println("Number is $num")
        6 -> println("Number is $num")
        else ->
            println("$num is Out of the box ")
    }

    //Using when as an expression
     var strng = when(num){
         1 ->
         {
             ("Number is $num")
         }
         2 -> ("Number is $num")
         3-> ("Number is $num")
         4 -> ("Number is $num")
         5-> ("Number is $num")
         6 -> ("Number is $num")
         else ->
             ("$num is Out of the box ")
    }
     println(strng)
}