package M_bookShop.stage_5_Collection_swing.printableInfo;

import java.util.List;

public class PrintableInfo {

    public void printableInfo(List<Printable> list) {
        for (Printable printable : list) {
            printable.print();
        }
    }
}
