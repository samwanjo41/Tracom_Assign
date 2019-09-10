package classes

class Aquarium{
    var length = 12
    var width = 22
    var height = 30

    fun volume(): Int {
        return width * height * length
    }
}

fun main() {
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    println("Length is ${myAquarium.length}\n Width is ${myAquarium.width}\n Height is ${myAquarium.height}")

    myAquarium.height = 49
    println("My new Aquarium height is ${myAquarium.height}")

    println("My Aquarium's water volume is: ${myAquarium.volume()} Litres")
}