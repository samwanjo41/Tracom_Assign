package kotlin_essentials_beyond_the_basics

class Book(var title: String, var author: String, var year: Int) {

    fun displayTitle(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

    fun main() {

        val book = Book("Devour the Heavens", "Sung Li", 2018)
        val bookTitleAuthor = book.displayTitle()
        val bookTitleAuthorYear = book.getTitleAuthorYear()

        println("${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

        println("${bookTitleAuthorYear.first} " +
                "by ${bookTitleAuthorYear.second} published in ${bookTitleAuthorYear.third}")

    }

