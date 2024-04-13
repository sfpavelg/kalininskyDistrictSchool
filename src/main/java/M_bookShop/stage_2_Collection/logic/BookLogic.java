package M_bookShop.stage_2_Collection.logic;


import M_bookShop.stage_2_Collection.collection.BookCollection;
import M_bookShop.stage_2_Collection.model.Book;

public class BookLogic {
    public BookCollection bookCollection = new BookCollection();

    public void addBookToCollection(String title, String author, int copies) {
        bookCollection.addBook(new Book(title, author, copies));
    }
}
