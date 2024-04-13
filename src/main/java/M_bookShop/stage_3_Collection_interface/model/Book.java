package M_bookShop.stage_3_Collection_interface.model;

import M_bookShop.stage_3_Collection_interface.printableInfo.Printable;

public class Book implements Printable {
    private final String name;
    private final String publisher;
    private final int copies;


    public Book(String title, String author, int copies) {
        this.name = title;
        this.publisher = author;
        this.copies = copies;
    }

    public void print() {
        System.out.println("Книга: " + name + "\\ Автор: " + publisher + "\\ Количество копий: " + copies);
    }
}

