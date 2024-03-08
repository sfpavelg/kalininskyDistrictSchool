package E_DrivingLesson;

public class StartDriving {
    public StartDriving(){


        PrototypeCar.staticDriving("Иван Иванович");
        System.out.println("За рулём прототипа сейчас находится: " + PrototypeCar.staticDriver);

        System.out.println("=================================================");
        PrototypeCar car1 = new PrototypeCar();
        PrototypeCar car2 = new PrototypeCar();
        PrototypeCar car3 = new PrototypeCar();

        car1.driving("Павел");
        car2.driving("Роман");
        car3.driving("Егор");
        car1.driving("Иван");

        System.out.println("На данный момент в кабине находится: " + car1.getDriver());
        System.out.println("На данный момент в кабине находится: " + car2.getDriver());
        System.out.println("На данный момент в кабине находится: " + car3.getDriver());

        System.out.println("Максимальная скорость для всех: " + car1.getMAX_SPEED());

        System.out.println("=================================================");

        PrototypeCar.staticDriving("Павел");
        System.out.println("За рулём прототипа сейчас находится: " + PrototypeCar.staticDriver);
        System.out.println("Максимальная скорость для учителя: " + PrototypeCar.MAX_SPEED_FOR_TEACHER);
    }
}
