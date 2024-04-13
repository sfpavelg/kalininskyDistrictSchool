package M_bookShop.stage_1_WeakConnection;

/**
 * 3. Далее, у нас есть класс Magazine, также реализующий интерфейс Printable и реализующий вывод информации о журнале:
 */

public class Magazine  implements Printable {

    private String name;
    private String publisher;
    private int copies;

    public Magazine(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
    }
    public Magazine(String name, String publisher, int copies) {

        this.name = name;
        this.publisher = publisher;
        this.copies = copies;
    }

    public void print() {
        System.out.println("Журнал: " + name + "\\ Опубликован: " + publisher + "\\ Количество копий: " + copies);
    }
}

