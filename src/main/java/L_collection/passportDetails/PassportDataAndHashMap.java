package L_collection.passportDetails;

import java.util.HashMap;

public class PassportDataAndHashMap {
    private String key; //переменная для уникального ключа
    private PassportData passportData1; //переменная для объекта с паспортными данными.
    private HashMap <String, PassportData> passportDataAndUser = new HashMap(); //Коллекция для хранения паспортных данных в виде: ключ - значение.

    public PassportDataAndHashMap(){
        key = "Иван";
        passportDataAndUser.put(key, new PassportData("Иванов")); //Создание объекта c переменной

        key = "Николаев Николай Николаевич";
        passportData1 = new PassportData("Николаев", "Николай", "Николаевич");
        passportDataAndUser.put(key, passportData1); //Так не удобно. Каждому экземпляру PassportData нужна своя переменная.


        key = "Павлов Павел Павлович";
        passportData1 = new PassportData("Павлов", "Павел", "Павлович"); //Можно переменную использовать многократно перезаписывая, но тогда в ней нет смысла.
        passportDataAndUser.put(key, passportData1); //Так не удобно. Каждому экземпляру PassportData нужна своя переменная.

        passportDataAndUser.put("Сергеев Сергей Сергеевич", new PassportData("Сергеев", "Сергей", "Сергеевич")); //Так не удобно. Каждому экземпляру PassportData нужна своя переменная.
        System.out.println(passportDataAndUser); //У коллекции есть встроенный итератор, поэтому данные буду выведены корректно, в отличие от массива, для которого нужен цикл.

        System.out.println("Забираем данные по уникальному ключу.  ++++++===========================");
        System.out.println("Вызываем данные из массива по ключу \"Сергеев Сергей Сергеевич\"\n" + passportDataAndUser.get("Сергеев Сергей Сергеевич")); //Забираем данные по уникальному ключу.

        System.out.println("Удаление значения по ключу    =========================================");
        passportDataAndUser.remove("Сергеев Сергей Сергеевич"); //Удаление значения по ключу
        System.out.println("Количество элементов в коллекции: " + passportDataAndUser.size());
        System.out.println("В базе есть \"Сергеев Сергей Сергеевич\"? Ответ: " + passportDataAndUser.containsKey("Сергеев Сергей Сергеевич"));

        System.out.println("Произойдёт перезапись данных и их потеря =================================");
        passportDataAndUser.put("Павлов Павел Павлович", new PassportData("Иванов", "Иван", "Иванович")); //Произойдёт перезапись данных.
        System.out.println(passportDataAndUser);

        System.out.println("Уберём ложные данные =====================================================");
        passportDataAndUser.remove("Павлов Павел Павлович"); //Уберём ложные данные
        System.out.println(passportDataAndUser);

        System.out.println("Запись данных с проверкой  ===============================================");
        //Чтобы избежать потери данных в случае двойников, помещаем данные через проверку:
        key = "Павлов Павел Павлович";

        if (passportDataAndUser.containsKey(key)){      //Если условие даст true, то блок if будет выполнен.
            System.out.println("Такой пользователь уже есть");
        }else {
            System.out.println("Такого  пользователя нет. Данные внесены в БД.");
            passportDataAndUser.put(key, new PassportData("Павлов", "Павел", "Павлович"));
        }

        System.out.println(passportDataAndUser);

        System.out.println("Повторная запись данных с проверкой  ======================================");
        //Чтобы избежать потери данных в случае двойников, помещаем данные через проверку:
        key = "Павлов Павел Павлович";

        if (passportDataAndUser.containsKey(key)){      //Если условие даст true, то блок if будет выполнен.
            System.out.println("Такой пользователь найден,  перезапись данных невозможна!!!");
//            passportDataAndUser.put(key, new PassportData("Павлов", "Павел", "Павлович"));
        }else {
            System.out.println("Такого пользователя в Базе Данных нет, произвожу запись данных.");
            passportDataAndUser.put(key, new PassportData("Павлов", "Павел", "Павлович"));
        }

        System.out.println(passportDataAndUser);

        System.out.println("Полная очистка коллекции   +++===================================");
        passportDataAndUser.clear(); //Полная очистка коллекции.
        System.out.println(passportDataAndUser);

    }
}
