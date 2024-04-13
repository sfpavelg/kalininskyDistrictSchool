package M_bookShop.stage_2_Collection.logic;

import M_bookShop.stage_2_Collection.collection.NewspaperCollection;
import M_bookShop.stage_2_Collection.model.Newspaper;

public class NewspaperLogic {
    public NewspaperCollection newspaperCollection = new NewspaperCollection();

    public void addNewspaperToCollection(String title, String author, int copies) {
        newspaperCollection.addBook(new Newspaper(title, author, copies));
    }
}
