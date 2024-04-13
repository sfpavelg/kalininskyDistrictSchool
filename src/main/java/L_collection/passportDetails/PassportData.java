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

//    PassportData(){
//
//    }

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

    public PassportData(String name) {
        this.name = name;
    }

    public PassportData(String name, int series, int number) {
        this.name = name;
        this.series = series;
        this.number = number;
    }

//    @Override
//    public String toString() {
//        return "\Паспортные данные{" +
//                "\nИмя: " + name + '\'' +
//                ", \nФамилия: " + lastname + '\'' +
//                ", \nОтчество: " + surname + '\'' +
//                ", \nДень Рождения: " + birthday +
//                ", \nСерия Паспорта: " + series +
//                ", \nНомер Паспорта:" + number +
//                ", \nМесто регистрации Паспорта: " + placeOfRegistration + '\'' +
//                ", \nДата регистрации Паспорта: " + registrationDate +
//                ", \nМесто прописки: " + placeOfResidence + '\'' +
//                '}' + '\n';
//    }


    @Override
    public String toString() {
        return "PassportData{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
