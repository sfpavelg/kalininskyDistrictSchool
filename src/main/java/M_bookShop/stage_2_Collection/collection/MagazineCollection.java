package M_bookShop.stage_2_Collection.collection;

import M_bookShop.stage_2_Collection.model.Magazine;

import java.util.ArrayList;
import java.util.List;

public class MagazineCollection {
    private List<Magazine> list = new ArrayList<Magazine>();

    public void addBook(Magazine magazine) {

        list.add(magazine);
    }

    public List<Magazine> getMagazine() {

        return list;
    }
}
