package M_bookShop.stage_3_Collection_interface;

import M_bookShop.stage_3_Collection_interface.logic.PublicationLogic;
import M_bookShop.stage_3_Collection_interface.printableInfo.PrintableInfo;

public class Main {
    public static void main(String[] args) {
        PrintableInfo printableInfo = new PrintableInfo();


        PublicationLogic publicationLogic = new PublicationLogic();
        publicationLogic.addBookToCollection("Мастер и Маргарита", "Михаил Булгаков", 50);
        publicationLogic.addBookToCollection("Преступление и наказание", "Фёдор Достоевский", 40);
        publicationLogic.addBookToCollection("Война и мир", "Лев Толстой", 20);
        publicationLogic.addBookToCollection("Гарри Поттер и философский камень", "Дж. К. Роулинг", 150);
        publicationLogic.addBookToCollection("1984", "Джордж Оруэлл", 35);
        publicationLogic.addBookToCollection("Маленький принц", "Антуан де Сент-Экзюпери", 25);
        publicationLogic.addBookToCollection("Учебник по математике", "Николай Иванов", 30);
        publicationLogic.addBookToCollection("О дивный новый мир", "Олдос Хаксли", 40);
        publicationLogic.addBookToCollection("Анна Каренина", "Лев Толстой", 20);
        publicationLogic.addBookToCollection("Медный всадник", "Александр Пушкин", 25);
        printableInfo.printableInfo(publicationLogic.publicationCollection.getPublication());

        System.out.println("=========================================================================");
        publicationLogic.addMagazineToCollection("Интеллектуальный мир","Издатель: ООО \"Мысль\"", 50);
        publicationLogic.addMagazineToCollection("Красота и Здоровье","Издатель: Издательский дом \"Здравствуйте\"", 50);
        publicationLogic.addMagazineToCollection("Наука и Техника","Издатель: Научно-техническое издательство \"Прогресс\"", 50);
        publicationLogic.addMagazineToCollection("Мода и Стиль","Издатель: ООО \"Журналы и Мода\"", 50);
        publicationLogic.addMagazineToCollection("Путешествия по миру","Издатель: Издательство \"Глобус\"", 50);
        publicationLogic.addMagazineToCollection("Кулинарные удовольствия","Издатель: ООО \"Кулинарные издания\"", 50);
        publicationLogic.addMagazineToCollection("Искусство и Культура","Издатель: Издательство \"Арт-Планета\"", 50);
        publicationLogic.addMagazineToCollection("Технологии будущего"," Издатель: Издательство \"Инновации\"", 50);
        publicationLogic.addMagazineToCollection("Женские секреты","Издатель: ООО \"Женский мир\"", 50);
        publicationLogic.addMagazineToCollection("Спортивный успех","Издатель: Спортивные издания Группа", 50);
        printableInfo.printableInfo(publicationLogic.publicationCollection.getPublication());

    }
}
