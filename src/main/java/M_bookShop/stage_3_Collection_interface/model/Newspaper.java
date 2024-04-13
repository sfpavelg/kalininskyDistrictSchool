package M_bookShop.stage_3_Collection_interface.model;

import M_bookShop.stage_3_Collection_interface.printableInfo.Printable;

public class Newspaper implements Printable {

    private String name;
    private String publisher;
    private int copies;

    public Newspaper(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    public Newspaper(String name, String publisher, int copies) {
        this.name = name;
        this.publisher = publisher;
        this.copies = copies;
    }

    public void print() {
        System.out.println("Газета: " + name + "\\ Издательство: " + publisher + "\\ Количество копий: " + copies);
    }
}
