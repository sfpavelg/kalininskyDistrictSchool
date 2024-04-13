package M_bookShop.stage_3_Collection_interface.printableInfo;

import java.util.List;

public class PrintableInfo {

    public void printableInfo(List <Printable> list){
        for (Printable printable: list) {
            printable.print();
        }
    }
}
