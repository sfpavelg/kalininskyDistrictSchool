package M_bookShop.stage_5_Collection_swing;

import M_bookShop.stage_5_Collection_swing.frame.BookShopFrame;
import M_bookShop.stage_5_Collection_swing.logic.PublicationLogic;
import M_bookShop.stage_5_Collection_swing.migration.MigrationToCollection;

public class Main {
    public static void main(String[] args) {
        PublicationLogic publicationLogic = new PublicationLogic();
        new MigrationToCollection(publicationLogic); //Создаём объект для миграции данных в БД

        new BookShopFrame(publicationLogic); // Создание главного окна приложения

    }
}
