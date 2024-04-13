package M_bookShop.stage_2_Collection.printableInfo;

import M_bookShop.stage_2_Collection.model.Book;
import M_bookShop.stage_2_Collection.model.Magazine;
import M_bookShop.stage_2_Collection.model.Newspaper;

import java.util.List;

public class PrintableInfo {

    public void printableBook(List<Book> list) {
        for (Book book : list) {
            book.print();
        }
    }
    public void printableMagazine(List<Magazine> list) {
        for (Magazine magazine : list) {
            magazine.print();
        }
    }
    public void printableNewspaper(List<Newspaper> list) {
        for (Newspaper newspaper : list) {
            newspaper.print();
        }
    }
}
