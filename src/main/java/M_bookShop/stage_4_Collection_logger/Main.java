package M_bookShop.stage_4_Collection_logger;

import M_bookShop.stage_4_Collection_logger.logger.LoggerUtil;
import M_bookShop.stage_4_Collection_logger.logic.PublicationLogic;
import M_bookShop.stage_4_Collection_logger.migration.MigrationToCollection;
import M_bookShop.stage_4_Collection_logger.printableInfo.PrintableInfo;

public class Main {
    public static void main(String[] args) {
        PrintableInfo printableInfo = new PrintableInfo(); //Создаём объект для печати
        //Создаём объект логики для работы с Базой данных, а под капотом будут созданы ещё два объекта PublicationCollection и List
        PublicationLogic publicationLogic = new PublicationLogic();
        new MigrationToCollection(publicationLogic); //Создаём объект для миграции данных в БД
        //Печать миграции на экран
        System.out.println("===   Печать миграции на экран.   =============================================================================================================");
        printableInfo.printableInfo(publicationLogic.publicationCollection.getList()); //Выводим данные на печать.

        System.out.println("===   Дополнение коллекции новыми позициями.  =================================================================================================");
        LoggerUtil.logInfo(publicationLogic.addPublicationToCollection("Вторжение гигантов", "Хадзимэ Исаяма", "Манга", 50));
        printableInfo.printableInfo(publicationLogic.publicationCollection.getList()); //Выводим данные на печать.

        System.out.println("===   Изменение количества копия конкретной позиции.  =========================================================================================");
        LoggerUtil.logInfo(publicationLogic.updateCopiesByTitle("Вторжение гигантов", 38));
        printableInfo.printableInfo(publicationLogic.publicationCollection.getList()); //Выводим данные на печать.

        System.out.println("===   Удаление из базы данных позиции по названию.  ===========================================================================================");
        LoggerUtil.logInfo(publicationLogic.deletePublicationByTitle("Газета А"));
        printableInfo.printableInfo(publicationLogic.publicationCollection.getList()); //Выводим данные на печать.
        System.out.println("===============================================================================================================================================");

    }
}
