package K_abstraction.Car;

public class Car {
    private EngineCar engine;

    public Car(EngineCar engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {
        return  "Car{" +
                "engine=" + engine +
                '}';
    }

}
