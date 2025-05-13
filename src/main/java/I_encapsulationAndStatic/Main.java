package I_encapsulationAndStatic;

/**
 * Инкапсуляция, Статика, оператор final
 */
public class Main {
    public static void main(String[] args) {
        int x;
        String v;
        x = 1;

//        Money money;
//        money= new Money();
//        Money money1 = new Money();
////        Money money2 = new Money();
        Money money = Money.singleton(); //создание singleton
//        Money money1 = Money.singleton(); //обращение к уже созданному singleton
////
        System.out.println("Работа стандартного сервиса!");
        money.request(100);
        money.request(100);
        money.request(100);
        money.request(100);
//        money1.request(80);
////        money2.request(80);
//        System.out.println("================================================");

//        AccountHacking accountHacking = new AccountHacking();
//        System.out.println("Попытка взлома Аккаунта!");
//        System.out.println("Снято:" + accountHacking.request(150));





//Тема другого урока. Значение и ссылка. Пул интов.
//        Integer a = 127;
//        Integer b = 127;
//        Integer c = 128;
//        Integer d = 128;
//        int x = 128;
//        int y = 128;
//        Money money2 = new Money();
//        System.out.println(a == b); //true, потому что значение взято из пула интов и произведена авто-распаковка
//        System.out.println(c == d); //false, потому что авто-распаковки не было и сравниваются два объекта.
//        System.out.println(money == money2); //всегда false, так как money и money2  разные объекты, то ссылки на них буду разные.
//        System.out.println(x == y);

    }
}
