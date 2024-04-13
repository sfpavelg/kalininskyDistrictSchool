package M_bookShop.stage_1_WeakConnection;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book("Мастер и Маргарита", "Михаил Булгаков", 20);
//        book.setCopies(19); //продажа 05.04.24
//        book.setCopies(18); //продажа 07.04.24
//        book.setCopies(28); //завоз   07.04.24
//        book.print();
//
//        Book book2 = new Book("Преступление и наказание", "Фёдор Достоевский", 40);
//        book2.print();


        Printable book = new Book("Мастер и Маргарита", "Михаил Булгаков", 20);
        Printable magazine = new Magazine("Интеллектуальный мир", "Издатель: ООО \"Мысль\"");
        new PrintableInfo(magazine);
        new PrintableInfo(book);
/**
 * 5. Теперь мы можем включить новый класс Newspaper в существующий код, не изменяя никаких других классов.
 * Таким образом, благодаря слабой связи через интерфейс Printable, мы смогли легко добавить новый класс Newspaper
 * в нашу программу без необходимости изменения существующего кода. Это демонстрирует гибкость и расширяемость
 * нашего кода благодаря использованию интерфейсов.
 */
        Printable newspaper = new Newspaper("Новости России", "Росгазета");
        new PrintableInfo(newspaper);
    }

}
