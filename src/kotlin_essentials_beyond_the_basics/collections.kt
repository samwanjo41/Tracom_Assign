package kotlin_essentials_beyond_the_basics

fun main() {
    val allBooks = setOf<String>("Wrath", "100 Milleniums of cultivation", "Release that witch")
    println(allBooks)
    println("The set contains ${allBooks.size} elements.") //find number of elements in the set
    val w1 = allBooks.elementAt(0) //find element at specific index
    println(w1)

    val library = mapOf(allBooks.elementAt(0) to "Sung li", allBooks.elementAt(1) to "Kevin Hinds", allBooks.elementAt(2) to "Julia"  )

    var moreBooks = mutableMapOf("Realms of Legends" to "Ryan Cashim")

    moreBooks.getOrPut("Valour") {"Hurrah"}
    moreBooks.getOrPut("King Of Gods") {"Rimley Harper"}
    println(moreBooks)

    println(library.any { it.key == "Hamlet" })
    println(library.any {it.value.contains(allBooks.elementAt(0))})
    println(library.containsKey("Hamlet"))// finds if Hamlet is in the map
}