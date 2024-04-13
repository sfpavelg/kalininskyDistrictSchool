package M_bookShop.stage_4_Collection_logger.printableInfo;

import java.util.List;

public class PrintableInfo {

    public void printableInfo(List<Printable> list) {
        for (Printable printable : list) {
            printable.print();
        }
    }
}
