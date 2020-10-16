import netscape.javascript.JSObject

fun main(){
    /*The while loop is used to iterate a part of program several time.
    Loop executed the block of code until the condition has true.
    Kotlin while loop is similar to Java while loop.*/
   var i =1;
    while (i<5){
        println("Value is $i")
        i++;
    }
    /*The do-while loop is similar to while loop except one key difference.
    A do-while loop first execute the body of do block after that it check the condition of while.*/
    var k = 1
    do {
        println(k)
        k++
    }
    while (k<5)

    /*Kotlin for loop is used to iterate a part of program several times.
    It iterates through arrays, ranges, collections,or anything that provides for iterate.
    Kotlin for loop is equivalent to the foreach loop in languages like C#.*/
    //We use for loop when you know the range
    //Range
   println("########################################################################################################")
  //  var range =  1 .. 10 //Now this range contains 10 values
 //   var range = 10 downTo 1
    var range = 1 until 16 //It takes upto 15
    var array = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for (i in range step 2){
        println(i)
    }
    for (i in range.reversed() step 2){
        println(i)
    }
    for ((index, value) in range.withIndex()){
        println("Index is $index and Value is $value")
    }

    var charAscii = 'A' .. 'z'
    for ((a,  b) in charAscii.withIndex()){
        println("Index is $a and Value is $b")
    }

    println(charAscii.count())





}