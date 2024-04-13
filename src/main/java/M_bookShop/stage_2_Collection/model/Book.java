package M_bookShop.stage_2_Collection.model;

import M_bookShop.stage_2_Collection.printableInfo.Printable;

public class Book implements Printable {
    private String name;
    private String publisher;
    private int copies;



    public Book(String title, String author, int copies) {
        this.name = title;
        this.publisher = author;
        this.copies = copies;
    }

    public void print() {
        System.out.println("Книга: " + name + "\\ Автор: " + publisher + "\\ Количество копий: " + copies);
    }
}

