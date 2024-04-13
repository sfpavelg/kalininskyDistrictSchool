package M_bookShop.stage_4_Collection_logger.logic;


import M_bookShop.stage_4_Collection_logger.collection.PublicationCollection;
import M_bookShop.stage_4_Collection_logger.model.Publication;
import M_bookShop.stage_4_Collection_logger.printableInfo.Printable;

import java.util.List;

public class PublicationLogic {

    public PublicationCollection publicationCollection = new PublicationCollection();

    //Метод добавления в коллекцию.
    public String addPublicationToCollection(String title, String author, String type, int copies) {
        List<Printable> publicationList = publicationCollection.getList();
        if(publicationList.isEmpty()) {
            publicationList.add(new Publication(title, author, type, copies));
            publicationCollection.setList(publicationList);
            return "Публикация с названием: '" + title + "' успешно добавлена.";
        }
        for (Printable publication : publicationList) {
            Publication p = (Publication) publication;
            if (p.getName().equals(title)) {
                return "Публикация с названием '" + title + "' не добавлена, так как уже существует.";
            }
        }
        publicationList.add(new Publication(title, author, type, copies));
        publicationCollection.setList(publicationList);
        return "Добавлена новая публикация с названием: '" + title + "'.";
    }

    //Метод изменения количества копий.
    public String updateCopiesByTitle(String title, int newCopies) {
        List<Printable> publicationList = publicationCollection.getList();
        for (Printable publication : publicationList) {
            Publication p = (Publication) publication;
            if (p.getName().equals(title)) {
                p.setCopies(newCopies);
                publicationCollection.setList(publicationList);
                return "Количество копий для публикации '" + title + "' успешно обновлено: " + newCopies;
            }
        }
        return "Публикация с названием '" + title + "' не найдена.";
    }

    //Метод удаления элемента по названию.
    public String deletePublicationByTitle(String title) {
        List<Printable> publicationList = publicationCollection.getList();
        for (Printable publication : publicationList) {
            Publication p = (Publication) publication;
            if (p.getName().equals(title)) {
                publicationList.remove(p);
                publicationCollection.setList(publicationList);
                return "Публикация с названием '" + title + "' успешно удалена.";
            }
        }
        return "Публикация с названием '" + title + "' не найдена.";
    }
}
