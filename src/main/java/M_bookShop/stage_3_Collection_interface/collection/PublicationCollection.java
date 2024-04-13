package M_bookShop.stage_3_Collection_interface.collection;

import M_bookShop.stage_3_Collection_interface.printableInfo.Printable;

import java.util.ArrayList;
import java.util.List;

public class PublicationCollection {
    private List<Printable> list = new ArrayList<Printable>();

    public void addPublication(Printable printable) {

        list.add(printable);
    }

    public List<Printable> getPublication() {

        return list;
    }

}


