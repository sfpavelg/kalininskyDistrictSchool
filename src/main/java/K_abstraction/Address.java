package K_abstraction;

public class Address {
    private String cityName;
    private String streetName;
    private int houseNumber;

    Address(String cityName, String streetName, int houseNumber) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }
    @Override
    public String toString() {
        return "Адрес установки дома: {" +
                "Город:\'" + cityName + '\'' +
                ", Улица:\'" + streetName + '\'' +
                ", Номер дома: " + houseNumber +
                '}';
    }
}
