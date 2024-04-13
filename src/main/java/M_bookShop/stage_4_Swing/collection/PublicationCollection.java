package M_bookShop.stage_4_Swing.collection;

import M_bookShop.stage_4_Swing.printableInfo.Printable;

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


