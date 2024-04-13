package M_bookShop.stage_2_Collection;

import M_bookShop.stage_2_Collection.logic.BookLogic;
import M_bookShop.stage_2_Collection.logic.MagazineLogic;
import M_bookShop.stage_2_Collection.printableInfo.PrintableInfo;

public class Main {
    public static void main(String[] args) {
        PrintableInfo printableInfo = new PrintableInfo();

        BookLogic bookLogic = new BookLogic();
        bookLogic.addBookToCollection("Мастер и Маргарита", "Михаил Булгаков", 50);
        bookLogic.addBookToCollection("Преступление и наказание", "Фёдор Достоевский", 40);
        bookLogic.addBookToCollection("Война и мир", "Лев Толстой", 20);
        bookLogic.addBookToCollection("Гарри Поттер и философский камень", "Дж. К. Роулинг", 150);
        bookLogic.addBookToCollection("1984", "Джордж Оруэлл", 35);
        bookLogic.addBookToCollection("Маленький принц", "Антуан де Сент-Экзюпери", 25);
        bookLogic.addBookToCollection("Учебник по математике", "Николай Иванов", 30);
        bookLogic.addBookToCollection("О дивный новый мир", "Олдос Хаксли", 40);
        bookLogic.addBookToCollection("Анна Каренина", "Лев Толстой", 20);
        bookLogic.addBookToCollection("Медный всадник", "Александр Пушкин", 25);
        printableInfo.printableBook(bookLogic.bookCollection.getBooks());

        MagazineLogic magazineLogic = new MagazineLogic();
        magazineLogic.addMagazineToCollection("Интеллектуальный мир","Издатель: ООО \"Мысль\"", 50);
        magazineLogic.addMagazineToCollection("Красота и Здоровье","Издатель: Издательский дом \"Здравствуйте\"", 50);
        magazineLogic.addMagazineToCollection("Наука и Техника","Издатель: Научно-техническое издательство \"Прогресс\"", 50);
        magazineLogic.addMagazineToCollection("Мода и Стиль","Издатель: ООО \"Журналы и Мода\"", 50);
        magazineLogic.addMagazineToCollection("Путешествия по миру","Издатель: Издательство \"Глобус\"", 50);
        magazineLogic.addMagazineToCollection("Кулинарные удовольствия","Издатель: ООО \"Кулинарные издания\"", 50);
        magazineLogic.addMagazineToCollection("Искусство и Культура","Издатель: Издательство \"Арт-Планета\"", 50);
        magazineLogic.addMagazineToCollection("Технологии будущего"," Издатель: Издательство \"Инновации\"", 50);
        magazineLogic.addMagazineToCollection("Женские секреты","Издатель: ООО \"Женский мир\"", 50);
        magazineLogic.addMagazineToCollection("Спортивный успех","Издатель: Спортивные издания Группа", 50);
        printableInfo.printableMagazine(magazineLogic.magazineCollection.getMagazine());



    }
}
