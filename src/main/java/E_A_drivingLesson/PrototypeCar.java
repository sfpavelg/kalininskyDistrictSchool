package E_A_drivingLesson;

public class PrototypeCar {

    private final int MAX_SPEED = 5;
    public static final int MAX_SPEED_FOR_TEACHER = 20;
    private String driver;
    public static String staticDriver;

    PrototypeCar() {
    }

    public void driving(String driver) {
        this.driver = driver;
        System.out.println("Вождение совершает ученик: " + this.driver);
    }

    public static void staticDriving(String staticDriver) {
        PrototypeCar.staticDriver = staticDriver;
        System.out.println("Вождение прототипа совершает: " + staticDriver);
    }

    public String getDriver() {
        return driver;
    }
    public int getMAX_SPEED(){
        return MAX_SPEED;
    }
}
