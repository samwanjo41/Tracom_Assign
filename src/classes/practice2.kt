package classes

open class Book(private var currentPage: Int){
   open fun readPage(): Int{
        return currentPage++
    }
}

class eBook(currentPage: Int, var format: String = "text"): Book(currentPage){
    override fun readPage(): Int {
        var wordCount: Int = 0
        return wordCount + 250
    }

}