package M_bookShop.stage_1_WeakConnection;

/**
 * 6. Теперь мы можем включить новый класс Newspaper в существующий код, не изменяя никаких других классов.
 * Таким образом, благодаря слабой связи через интерфейс Printable, мы смогли легко добавить новый класс Newspaper
 * в нашу программу без необходимости изменения существующего кода. Это демонстрирует гибкость и расширяемость
 * нашего кода благодаря использованию интерфейсов.
 */

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
