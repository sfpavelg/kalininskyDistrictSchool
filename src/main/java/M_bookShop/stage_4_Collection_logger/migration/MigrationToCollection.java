package M_bookShop.stage_4_Collection_logger.migration;

import M_bookShop.stage_4_Collection_logger.logic.PublicationLogic;

public class MigrationToCollection {
    private PublicationLogic publicationLogic;

    public MigrationToCollection(PublicationLogic publicationLogic) {

        publicationLogic.addPublicationToCollection("Мастер и Маргарита", "Михаил Булгаков", "Книги", 50);
        publicationLogic.addPublicationToCollection("Преступление и наказание", "Фёдор Достоевский", "Книги", 40);
        publicationLogic.addPublicationToCollection("Война и мир", "Лев Толстой", "Книги", 20);
        publicationLogic.addPublicationToCollection("Гарри Поттер и философский камень", "Дж. К. Роулинг", "Книги", 150);
        publicationLogic.addPublicationToCollection("1984", "Джордж Оруэлл", "Книги", 35);
        publicationLogic.addPublicationToCollection("Маленький принц", "Антуан де Сент-Экзюпери", "Книги", 25);
        publicationLogic.addPublicationToCollection("Учебник по математике", "Николай Иванов", "Книги", 30);
        publicationLogic.addPublicationToCollection("О дивный новый мир", "Олдос Хаксли", "Книги", 40);
        publicationLogic.addPublicationToCollection("Анна Каренина", "Лев Толстой", "Книги", 20);
        publicationLogic.addPublicationToCollection("Медный всадник", "Александр Пушкин", "Книги", 25);

        publicationLogic.addPublicationToCollection("Интеллектуальный мир", "Издатель: ООО \"Мысль\"", "Журналы", 50);
        publicationLogic.addPublicationToCollection("Красота и Здоровье", "Издатель: Издательский дом \"Здравствуйте\"", "Журналы", 50);
        publicationLogic.addPublicationToCollection("Наука и Техника", "Издатель: Научно-техническое издательство \"Прогресс\"", "Журналы", 50);
        publicationLogic.addPublicationToCollection("Мода и Стиль", "Издатель: ООО \"Журналы и Мода\"", "Журналы", 50);
        publicationLogic.addPublicationToCollection("Путешествия по миру", "Издатель: Издательство \"Глобус\"", "Журналы", 50);
        publicationLogic.addPublicationToCollection("Кулинарные удовольствия", "Издатель: ООО \"Кулинарные издания\"", "Журналы", 50);
        publicationLogic.addPublicationToCollection("Искусство и Культура", "Издатель: Издательство \"Арт-Планета\"", "Журналы", 50);
        publicationLogic.addPublicationToCollection("Технологии будущего", " Издатель: Издательство \"Инновации\"", "Журналы", 50);
        publicationLogic.addPublicationToCollection("Женские секреты", "Издатель: ООО \"Женский мир\"", "Журналы", 50);
        publicationLogic.addPublicationToCollection("Спортивный успех", "Издатель: Спортивные издания Группа", "Журналы", 50);

        publicationLogic.addPublicationToCollection("Новости России", "Росгазета", "Газеты", 50);
        publicationLogic.addPublicationToCollection("Вестник Москвы", "Журналистика", "Газеты", 50);
        publicationLogic.addPublicationToCollection("Русская Правда", "Издательский дом \"Слово\"", "Газеты", 50);
        publicationLogic.addPublicationToCollection("Советская Россия", "Издательство \"Информком\"", "Газеты", 50);
        publicationLogic.addPublicationToCollection("Московские Новости", "Московское издательство \"Вестник\"", "Газеты", 50);
        publicationLogic.addPublicationToCollection("Российский Вестник", "Издательский центр \"МедиаРоссия\"", "Газеты", 50);
        publicationLogic.addPublicationToCollection("Газета XXI века", "ООО \"Газета+\"", "Газеты", 50);
        publicationLogic.addPublicationToCollection("Наша Родина", "Издательство \"Отечество\"", "Газеты", 50);
        publicationLogic.addPublicationToCollection("Сибирская Трибуна", "Издательство \"Сибирские известия\"", "Газеты", 50);
        publicationLogic.addPublicationToCollection("Газета А", "Русское издательство А", "Газеты", 50);
        this.publicationLogic = publicationLogic;
    }

    public PublicationLogic getPublicationLogic() {
        return publicationLogic;
    }
}
