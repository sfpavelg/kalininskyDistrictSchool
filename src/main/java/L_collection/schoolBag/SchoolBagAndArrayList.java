package L_collection.schoolBag;

import java.util.ArrayList;

public class SchoolBagAndArrayList {
    HomeBox homeBox = new HomeBox(); //Домашний шкаф
    ArrayList<String> schoolBagAndArrayList = new ArrayList(); //Портфель на базе коллекции ArrayList
    String[] schoolBag2 = new String[8];
    String name;
    int z = 1;


    public SchoolBagAndArrayList() {
        schoolBag2[0] = homeBox.getBoxWithPens();
        schoolBagAndArrayList.add(homeBox.getBoxWithPens());    //add() - добавляет по очереди элементы, присваивая новый индекс, начиная с 0.
        schoolBagAndArrayList.add(homeBox.getBoxWithRulers());
        schoolBagAndArrayList.add(homeBox.getBoxWithPencils());
        schoolBagAndArrayList.add(homeBox.getBoxWithSchoolDiaries());
        schoolBagAndArrayList.add(homeBox.getMathematicsTextbook());
        schoolBagAndArrayList.add(homeBox.getMathematicsNotebook()); //Соответственно, тут элемент лежит под индексом 5
        schoolBagAndArrayList.add("Деньги");
        System.out.println(schoolBagAndArrayList.toString());   // Вывод всех элементов (for-each зашит).Предварительно, преобразовав все элементы к типу String.
        System.out.println("================================================================");
        schoolBagAndArrayList.add(0,"Кроссовки");
        System.out.println(schoolBagAndArrayList);              // Вывод всех элементов (for-each зашит). Преобразование выполнять не обязательно.
        System.out.println("================================================================");

        System.out.println(schoolBagAndArrayList.get(0));       // Вывод элемента по конкретному индексу.
        schoolBagAndArrayList.add(8, "Бутерброд"); //Добавляет элемент по индексу. В чём опасность?
        System.out.println(schoolBagAndArrayList);              // Вывод всех элементов (for-each зашит). Преобразование выполнять не обязательно.

//
        schoolBagAndArrayList.remove(6);                  //Удаляет элемент по индексу
        schoolBagAndArrayList.remove("Бутерброд");            //Удаляет элемент по значению, если только такое значение есть в наличии
        System.out.println("================================================================");
        System.out.println(schoolBagAndArrayList);              // Вывод всех элементов (for-each зашит). Преобразование выполнять не обязательно.

        System.out.println(schoolBagAndArrayList.size());       //Узнаём сколько элементов в коллекции.
        //schoolBagAndArrayList.add(8, "Бутерброд"); //Добавляет элемент по индексу. В чём опасность? Потому что последний индекс 6-й

        System.out.println("Попытка №1======================================================");
        schoolBagAndArrayList.remove("Карандаш простой");   //Удаляет элемент по значению, если только такое значение есть в наличии. (Такая строка не найдена)
        System.out.println(schoolBagAndArrayList);
        System.out.println("Попытка №2======================================================");
        schoolBagAndArrayList.remove("Карандаш простой.");   //Удаляет элемент по значению, если только такое значение есть в наличии.
        System.out.println(schoolBagAndArrayList);
        //System.out.println(schoolBagAndArrayList.size());       //Узнаём сколько элементов в коллекции.

        System.out.println(schoolBagAndArrayList.indexOf("Линейка.")); //Вернёт индекс ячейки, где лежит данный элемент. Если не найден, вернёт -1
        System.out.println("================================================================");
        System.out.println(schoolBagAndArrayList.isEmpty());    //Задаёт вопрос, коллекция пустая?
        schoolBagAndArrayList.clear();                          //Удаляет все элементы
        System.out.println(schoolBagAndArrayList.isEmpty());    //Задаёт вопрос, коллекция пустая?
        System.out.println(schoolBagAndArrayList.size());       //Узнаём сколько элементов в коллекции.
        System.out.println(schoolBagAndArrayList.indexOf("Линейка.")); //Вернёт индекс ячейки, где лежит данный элемент. Если не найден, вернёт -1
    }
}
