package M_bookShop.stage_3_Collection_interface.logic;


import M_bookShop.stage_3_Collection_interface.collection.PublicationCollection;
import M_bookShop.stage_3_Collection_interface.model.Book;
import M_bookShop.stage_3_Collection_interface.model.Magazine;
import M_bookShop.stage_3_Collection_interface.model.Newspaper;

public class PublicationLogic {

    public PublicationCollection publicationCollection = new PublicationCollection();

    public void addBookToCollection(String title, String author, int copies) {
        publicationCollection.addPublication(new Book(title, author, copies));
    }

    public void addMagazineToCollection(String title, String author, int copies) {
        publicationCollection.addPublication(new Magazine(title, author, copies));
    }
    public void addNewspaperToCollection(String title, String author, int copies) {
        publicationCollection.addPublication(new Newspaper(title, author, copies));
    }

}
