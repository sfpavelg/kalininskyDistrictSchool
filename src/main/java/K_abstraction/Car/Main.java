package K_abstraction.Car;

public class Main {
    public static void main(String[] args) {
//        Engine v5 = new EngineCar("Дизель",5);
//        Car volvo = new Car(v5);
//        System.out.println(volvo);

        EngineCar v1 = new EngineCar("Б",1);
        Car volvo525 = new Car(v1);
        System.out.println(volvo525);

        EngineCar E1 = new EngineCarElectro("Б",1, "60V");
        Car volvoE525 = new Car(E1);
        System.out.println(volvoE525);
    }
}
