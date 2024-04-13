package M_bookShop.stage_2_Collection.model;

import M_bookShop.stage_2_Collection.printableInfo.Printable;

public class Magazine implements Printable {

    private String name;
    private String publisher;
    private int copies;

    public Magazine(String name, String publisher, int copies) {

        this.name = name;
        this.publisher = publisher;
        this.copies = copies;
    }

    public void print() {
        System.out.println("Журнал: " + name + "\\ Опубликован: " + publisher + "\\ Количество копий: " + copies);
    }
}

