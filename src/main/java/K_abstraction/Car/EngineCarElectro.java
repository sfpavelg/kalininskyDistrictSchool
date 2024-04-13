package K_abstraction.Car;

public class EngineCarElectro extends EngineCar{
  public String volt;
    public EngineCarElectro(String type, int volume, String volt) {
        super(type, volume);
        this.volt = volt;
    }

    @Override
    public void engine(){

    }

    @Override
    public String toString() {
        return "EngineCarElectro{" +
                "volt='" + volt + '\'' +
                '}';
    }
}