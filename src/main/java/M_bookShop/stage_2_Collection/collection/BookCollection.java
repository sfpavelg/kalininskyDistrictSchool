package M_bookShop.stage_2_Collection.collection;

import M_bookShop.stage_2_Collection.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {

        books.add(book);
    }

    public List<Book> getBooks() {

        return books;
    }
}

