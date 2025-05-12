package Y_hashCode_equals;

public class Main {
    public static void main(String[] args) {
//        CarSharing obj1 = new CarSharing("hello", "world");
//        CarSharing obj2 = new CarSharing("hello", "world");

//        System.out.println(obj1.hashCode()); // Вывод хэш-кода объекта obj1
//        System.out.println(obj2.hashCode()); // Вывод хэш-кода объекта obj2

        //new Car(new DriverHome("Антон"));
//        new Car(new DriverFriend("Егор"));

        DriverHome driverHome = new DriverHome("Антон");
        new Car(driverHome);



        DriverHome driver1 = new Driver1("Егор", "102235");
        new Car(driver1);

    }
}
