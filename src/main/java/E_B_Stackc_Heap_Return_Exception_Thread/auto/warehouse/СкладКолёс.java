package E_B_Stackc_Heap_Return_Exception_Thread.auto.warehouse;

public class СкладКолёс {
    int колесо = 100;

    private static СкладКолёс ЕДИНСТВЕННЫЙСкладКолёс;
    private СкладКолёс(){}


    public static СкладКолёс ЕДИНСТВЕННЫЙСкладКолёс() {
        if (ЕДИНСТВЕННЫЙСкладКолёс == null) {
            ЕДИНСТВЕННЫЙСкладКолёс = new СкладКолёс();
            System.out.println("Создан новый объект ЕДИНСТВЕННЫЙСкладКолёс");
        }
        System.out.println("Обращение к уже существующему объекту ЕДИНСТВЕННЫЙСкладКолёс");
        return ЕДИНСТВЕННЫЙСкладКолёс;
    }

    public int роботПоВыдачеКолёс() throws InterruptedException {
        колесо = колесо -4;
        String остаток = toString();

        Thread.sleep(5000); //задержка на 5 секунд
        System.out.println("Остаток Колёс На Складе:" + остаток);


        Thread.sleep(5000); //задержка на 5 секунд
        System.out.println("роботПоВыдачеКолёс выдал 4 колеса");

        return 4;
    }

    @Override
    public String toString() {
        return String.valueOf(колесо);
    }
}
