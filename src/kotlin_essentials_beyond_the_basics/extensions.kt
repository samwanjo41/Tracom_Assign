package kotlin_essentials_beyond_the_basics

import java.util.*

class Book2(var title: String, var author: String, var year: Int, var pages: Int) {

    fun displayTitle(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun Book2.weight(): Double {
        return (pages * 1.5)
    }

    fun Book2.tornPages(torn: Int) {
        if (pages >= torn) {
            pages -= torn
        } else {
            pages = 0
        }
    }

    fun tornPages(nextInt: Int) {

    }

}

class Puppy() {
    fun playWithBook(book: Book2) {
        book.tornPages(Random().nextInt(100))
    }
}



fun main() {
    val puppy = Puppy()
    val book = Book2("Facing Mt. Kenya", "Ngugi wa Thiong'o", 2003, 433)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Stupid dog has eaten all pages in ${book.title}. ")
}