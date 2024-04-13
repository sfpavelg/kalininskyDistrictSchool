package M_bookShop.stage_5_Collection_swing;

import M_bookShop.stage_5_Collection_swing.frame.BookShopFrame;
import M_bookShop.stage_5_Collection_swing.logger.LoggerUtil;
import M_bookShop.stage_5_Collection_swing.logic.PublicationLogic;
import M_bookShop.stage_5_Collection_swing.migration.MigrationToCollection;
import M_bookShop.stage_5_Collection_swing.printableInfo.PrintableInfo;

public class Main {
    public static void main(String[] args) {
        PrintableInfo printableInfo = new PrintableInfo(); //Создаём объект для печати
        //Создаём объект логики для работы с Базой данных, а под капотом будут созданы ещё два объекта PublicationCollection и List
        PublicationLogic publicationLogic = new PublicationLogic();
        new MigrationToCollection(publicationLogic); //Создаём объект для миграции данных в БД

        BookShopFrame bookShopFrame = new BookShopFrame(publicationLogic); // Создание главного окна приложения

    }
}
