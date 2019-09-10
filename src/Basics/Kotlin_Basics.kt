package Basics

fun main() {
    //Quiz one
    2 + 71 + 233 - 13 / 30 + 1

    //Quiz Two
    var rainbowColor: String = "violet"
    rainbowColor = "blue"

    val blackColor: String = "black"
    // blackColor = "green" //cannot change a value assigned to a val


    // rainbowColor = null  //Error because rainbowColor is not nullable

    var greenColor: String? = "null"
    var blueColor: Int? = null

    //Practice Nullability/Lists
    var empty = listOf<Int?>(null, null) // creating a list of nulls
    listOf(null, null)

   // Practice Time: Null Checks
    var nullTest: Int? = null
    if(nullTest != 0){
        nullTest = nullTest!! + 1
    } else {
        println("0")
    }

    //Practice Strings
    var fish: String = "trout"
    var samaki: String = "haddock"
    var fis: String = "snapper"

    println("I like $fish. $samaki on the other hand icks me and $fis is something I have never eaten")
    println()
    //Practice when statements
    var fishName: Int = 10
    when (fishName) {
        0 -> println("error message")
        in 3..12 -> println("Good fish name")
        else -> "OK fish name"
    }
    println()

    //Practice Loops
    var numbers = intArrayOf(11, 12, 13, 14, 15)
    var list = mutableListOf<String>()

    for(number in numbers){
        list.add(number.toString())
    }
    println(list)
    println()

    var nums = arrayListOf<Int>()
    var i: Int

    for(i in 0..100){
        if(i%7 == 0){
            nums.add(i)
        }
    }
    print(nums)
}