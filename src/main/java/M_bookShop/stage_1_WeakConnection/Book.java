package M_bookShop.stage_1_WeakConnection;

/**
 * 2. Теперь у нас есть класс Book, который реализует интерфейс Printable и выполняет вывод информации о книге:
 */

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

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}

