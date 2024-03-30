package L_collection.passportDetails;

import java.util.Date;

class PassportData {                //Нет геттеров, сеттеров. Убран public.
    private String name;
    private String lastname;
    private String surname;
    private Date birthday;
    private int series;
    private int number;
    private String placeOfRegistration;
    private Date registrationDate;
    private String placeOfResidence;

    //Нужно изучить генерацию перегруженных конструкторов.
    PassportData(String name, String lastname, String surname) {
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
    }
    //Преимущество конструктора в том, что не возможно пропустить аргумент.
    PassportData(String name, String lastname, String surname, Date birthday, int series, int number,
                        String placeOfRegistration, Date registrationDate, String placeOfResidence) {
        this.name = name;
        this.lastname = lastname;
        this.surname = surname;
        this.birthday = birthday;
        this.series = series;
        this.number = number;
        this.placeOfRegistration = placeOfRegistration;
        this.registrationDate = registrationDate;
        this.placeOfResidence = placeOfResidence;
    }

    @Override
    public String toString() {
        return "\nPassportData{" +
                "\nname='" + name + '\'' +
                ", \nlastname='" + lastname + '\'' +
                ", \nsurname='" + surname + '\'' +
                ", \nbirthday=" + birthday +
                ", \nseries=" + series +
                ", \nnumber=" + number +
                ", \nplaceOfRegistration='" + placeOfRegistration + '\'' +
                ", \nregistrationDate=" + registrationDate +
                ", \nplaceOfResidence='" + placeOfResidence + '\'' +
                '}' + '\n';
    }
}
