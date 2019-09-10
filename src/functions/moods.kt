package functions

fun main() {
    whatShouldIdoToday("HAPPY", "SUNNY")
}

fun whatShouldIdoToday(mood: String, weather: String, temperature: Int = 24){
    when{
        mood =="happy" &&  weather == "sunny" -> {
            println("go for a walk")
        }
        else -> println("Stay home and read")
    }
}