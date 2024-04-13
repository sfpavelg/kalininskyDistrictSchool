package M_bookShop.stage_5_Collection_swing.model;

import M_bookShop.stage_5_Collection_swing.printableInfo.Printable;

public class Publication implements Printable {
    private String name;
    private String publisher;
    private String type;
    private int copies;


    public Publication(String name, String publisher, String type, int copies) {
        this.name = name;
        this.publisher = publisher;
        this.copies = copies;
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("Название публикации: " + name + "\\ Кем опубликовано: " + publisher + "\\ Тип публикации: " + type + "\\ Количество копий: " + copies);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Публикация{" +
                "название: '" + name + '\'' +
                ", кем опубликовано: '" + publisher + '\'' +
                ", тип публикации: '" + type + '\'' +
                ", количество копий: " + copies +
                "}\n";
    }
}
