package K_abstraction;

public abstract class House {
    private String foundationPit;     //Котлован
    private String foundation;          //Фундамент
    private String buildingFloor;      //Этаж здания
    private String window;             //Окно
    private String door;                //Дверь
    private String roof;                //Крыша
    private String operationalPurpose;  //Эксплуатационное предназначение
    private Address address;             //Адрес установки здания

    House(String cityName, String streetName, int houseNumber) {
        this.address = new Address(cityName, streetName, houseNumber);
    }

    public String installationFoundationPit() {
        foundationPit = "Выкопан котлован глубиной 5 метров.";
        return foundationPit;
    }

    public String installationFoundation() {
        foundation = "Залит железобетонный фундамент.";
        return foundation;
    }

    public String installationBuildingFloor(int floorNumber) {
        buildingFloor = "Установлено " + floorNumber + " этажей.";
        return buildingFloor;
    }

    public String installationWindow(int windowNumber) {
        window = "Установлено " + windowNumber + " окон.";
        return window;
    }

    public String installationDoor(int doorNumber) {
        door = "Установлено " + doorNumber + " дверей.";
        return door;
    }

    public String installationRoof() {
        roof = "Установлена крыша";
        return roof;
    }

    public abstract void registrationOfOperationalPurpose();  //Регистрация эксплуатационного предназначения.

    public abstract Address buildingInstallationAddress(Address address); //Адрес установки.


    public Address getAddress() {
        return address;
    }

    public void setOperationalPurpose(String operationalPurpose) {
        this.operationalPurpose = operationalPurpose;
    }

    @Override
    public String toString() {
        return "Дом{\n" +
                "Эксплутационное предназначение: \'" + operationalPurpose + '\'' +
                ", \n" + address +
                ", \nКотлован: \'" + foundationPit + '\'' +
                ", \nФундамент: \'" + foundation + '\'' +
                ", \nЭтаж корпуса: \'" + buildingFloor + '\'' +
                ", \nОкна: \'" + window + '\'' +
                ", \nДвери: \'" + door + '\'' +
                ", \nКрыша: \'" + roof + '\'' +
                '}';
    }
}
