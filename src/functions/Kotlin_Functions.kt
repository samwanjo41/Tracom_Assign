package functions

fun main() {
   println(getBirthDay())
//        val msg = getFortuneCookie()
//        println("Your fortune is:  $msg")

}

//fun getFortuneCookie(): String {
//    var birthday: Int?
//    var fortunes = arrayListOf<String>(
//        "Water is wet. Carry an Umbrella",
//        "You will have a great day!",
//        "Things will go well for you today.",
//        "Enjoy a wonderful day of success.",
//        "Be humble and all will turn out well.",
//        "Today is a good day for exercising restraint.",
//        "Take it easy and enjoy life!",
//        "Treasure your friends because they are your greatest fortune."
//    )
//    val day = getBirthDay()
//    when(day){
//        28  -> return fortunes[6]
//        in 1..7 -> return fortunes[1]
//        else -> {
//            var num = day % fortunes.size
//            return fortunes[num]
//        }
//    }
//
//
//}

fun getBirthDay(): Int{
    //var birthDay: Int = Random().nextInt(31) + 1
    return readLine()!!.toInt()
}
