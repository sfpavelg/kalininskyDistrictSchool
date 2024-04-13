package M_bookShop.stage_2_Collection.model;

import M_bookShop.stage_2_Collection.printableInfo.Printable;

public class Newspaper implements Printable {

    private String name;
    private String publisher;
    private int copies;

    public Newspaper(String name, String publisher, int copies) {
        this.name = name;
        this.publisher = publisher;
        this.copies = copies;
    }

    public void print() {
        System.out.println("Газета: " + name + "\\ Издательство: " + publisher + "\\ Количество копий: " + copies);
    }
}
