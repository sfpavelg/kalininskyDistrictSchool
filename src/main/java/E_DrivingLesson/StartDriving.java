package E_DrivingLesson;

public class StartDriving {
    PrototypeCar car1;
    PrototypeCar car2;
    PrototypeCar car3;
    public StartDriving(){


        PrototypeCar.staticDriving("Иван Иванович");
        System.out.println("За рулём прототипа сейчас находится: " + PrototypeCar.staticDriver);

        System.out.println("=================================================");
        car1 = new PrototypeCar();
        car2 = new PrototypeCar();
        car3 = new PrototypeCar();


        car1.driving("Павел");
        car2.driving("Роман");
        car3.driving("Егор");
        System.out.println("На данный момент в кабине car1 находится: " + car1.getDriver());

        car1.driving("Иван");
        System.out.println("Максимальная скорость для ученика: "+ car2.getMAX_SPEED());

        System.out.println("На данный момент в кабине car1 находится: " + car1.getDriver());
        System.out.println("На данный момент в кабине car2 находится: " + car2.getDriver());
        System.out.println("На данный момент в кабине car3 находится: " + car3.getDriver());

        System.out.println("Максимальная скорость для всех: " + car1.getMAX_SPEED());

        System.out.println("=================================================");

        PrototypeCar.staticDriving("Павел");
        System.out.println("За рулём прототипа сейчас находится: " + PrototypeCar.staticDriver);
        System.out.println("Максимальная скорость для учителя: " + PrototypeCar.MAX_SPEED_FOR_TEACHER);
    }
}
