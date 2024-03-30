package K_abstraction;

public class BusinessCenter extends House implements InstallationOfFireAlarmSystemsGOST_R_59638_2021 {


    BusinessCenter(String cityName, String streetName, int houseNumber) {
        super(cityName, streetName, houseNumber);

        System.out.println(installationFoundationPit()); //Все эти методы имеют реализацию в классе House, и здесь вызываются через наследование.
        installationFoundation();
        installationBuildingFloor(29);
        installationWindow(100);
        installationDoor(50);
        installationRoof();
        registrationOfOperationalPurpose(); //В данном случае произойдёт вызов метода инициализированного в данном классе.
        buildingInstallationAddress(getAddress());
        System.out.println(toString());
        System.out.println(installationOfFireAlarmSystemsGOST_R_59638_2021());
    }


//    @Override
//    public String installationFoundationPit(){
//        return "Котлован копать не буду!";
//           }

    @Override
    public void registrationOfOperationalPurpose() {
        setOperationalPurpose("Бизнес-Центр \"Пегас\"");
    }

    @Override
    public Address buildingInstallationAddress(Address address) {
        return address;
    }


    public String installationOfFireAlarmSystemsGOST_R_59638_2021() {
        return "Установка системы пожаротушения по ГОСТ R_59638_2021";
    }
}
