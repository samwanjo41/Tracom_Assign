package kotlin_essentials_beyond_the_basics

const val MAX_NUMBER_BOOKS = 20

object Constants {
    const val BASE_URL = "http://www.mybook.com/"
}


class Book1(var title: String, var author: String, var year: Int) {

    fun displayTitle(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(booksBorrowed: Int): Boolean{
        if(booksBorrowed > MAX_NUMBER_BOOKS){
            return true
        }else {
            return false
        }
    }

    fun printUrl(){
        println(Constants.BASE_URL + title + ".html")
    }
    companion object {
        val BASE_URL = "http://www.mybook.com/"
    }
}