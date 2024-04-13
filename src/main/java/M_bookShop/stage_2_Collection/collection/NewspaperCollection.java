package M_bookShop.stage_2_Collection.collection;

import M_bookShop.stage_2_Collection.model.Newspaper;

import java.util.ArrayList;
import java.util.List;

public class NewspaperCollection {
    private List<Newspaper> list = new ArrayList<Newspaper>();

    public void addBook(Newspaper newspaper) {

        list.add(newspaper);
    }

    public List<Newspaper> getNewspaper() {

        return list;
    }
}
