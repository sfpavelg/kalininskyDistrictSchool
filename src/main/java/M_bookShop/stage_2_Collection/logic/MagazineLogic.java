package M_bookShop.stage_2_Collection.logic;

import M_bookShop.stage_2_Collection.collection.MagazineCollection;
import M_bookShop.stage_2_Collection.model.Magazine;

public class MagazineLogic {
    public MagazineCollection magazineCollection = new MagazineCollection();

    public void addMagazineToCollection(String title, String author, int copies) {
        magazineCollection.addBook(new Magazine(title, author, copies));
    }
}
