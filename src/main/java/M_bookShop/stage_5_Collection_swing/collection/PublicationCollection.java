package M_bookShop.stage_5_Collection_swing.collection;

import M_bookShop.stage_5_Collection_swing.printableInfo.Printable;

import java.util.ArrayList;
import java.util.List;

public class PublicationCollection {
    private List<Printable> list = new ArrayList<Printable>();

    public List<Printable> getList() {
        return list;
    }

    public void setList(List<Printable> list) {
        this.list = list;
    }
}


