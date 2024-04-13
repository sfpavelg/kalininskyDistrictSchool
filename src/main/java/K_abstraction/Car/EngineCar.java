package K_abstraction.Car;

public class EngineCar implements Engine{
    private String type;
    private int volume;

    public EngineCar(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "EngineCar{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                '}';
    }
    @Override
    public void engine(){

    }
}
