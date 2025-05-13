package E_B_Stackc_Heap_Return_Exception_Thread.auto.warehouse;

public class СкладДвигатели {
    int двигатель = 100;

    //Пример Паттерна Singleton (это значит объект, или иначе экземпляр класса, может быть создан в единственном экземпляре)
    private static СкладДвигатели ЕДИНСТВЕННЫЙСкладДвигателей;
    private СкладДвигатели(){}


    public static СкладДвигатели ЕДИНСТВЕННЫЙСкладДвигателей() {
        if (ЕДИНСТВЕННЫЙСкладДвигателей == null) {
            ЕДИНСТВЕННЫЙСкладДвигателей = new СкладДвигатели();
            System.out.println("Создан новый объект ЕДИНСТВЕННЫЙСкладДвигателей");
        }
        System.out.println("Обращение к уже существующему объекту ЕДИНСТВЕННЫЙСкладДвигателей");
        return ЕДИНСТВЕННЫЙСкладДвигателей;
    }



    public int роботПоВыдачеДвигателей() throws InterruptedException {
        двигатель = двигатель -1;
        String остаток = toString();

        Thread.sleep(5000); //задержка на 5 секунд
        System.out.println("Остаток Двигателей На Складе:" + остаток);

        Thread.sleep(5000); //задержка на 5 секунд
        System.out.println("роботПоВыдачеДвигателей выдал 1 двигатель");

        return 1;
    }
    @Override
    public String toString() {
        return String.valueOf(двигатель);
    }
}
