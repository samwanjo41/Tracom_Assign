package classes

class SimpleSpice {
    var name = "curry"
    var spiciness = "mild"

    var heat: Int
        get() {
            return 5
        }
        set(value) {}

}

fun main() {
    val spice = SimpleSpice()
    println("Name is ${spice.name} and heat is ${spice.heat}")
}