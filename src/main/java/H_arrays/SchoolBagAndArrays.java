package H_arrays;

public class SchoolBagAndArrays {
    HomeBox homeBox = new HomeBox(); //Создали экземпляр домашнего шкафа.
    public SchoolBagAndArrays(){
        completingSchoolBag();
    }
    void completingSchoolBag() {  //Объявили метод собирающий портфель.
        System.out.println("Собираем портфель с помощью массива.");

        String schoolBag[]; //Объявили строковый массив с названием schoolBag.
        schoolBag = new String[6]; //Создали объект (экземпляр) строкового массива на 4 ячейки. Но массив пока пустой.
        /*
        Примером можно взять ситуацию, когда я собрался строить гараж.
        Объявление массива - это я собрался строить гараж.
        А создание массива, это я уже его реально строю,
        поэтому я должен указать на сколько машин вместимостью будет мой гараж.
         */

        String schoolBagPrototype[];
        //Количество ячеек в массиве так же определяются, если мы в массив сразу помещаем элементы.
        //В данном примере массив заполняется элементами сразу при создании экземпляра(или по другому объекта).
        schoolBagPrototype = new String[]{"Карандаш простой.", "Ручка синяя.", "Линейка.", "Дневник."};
        //Созданный массив имеет в себе особенную числовую переменную,
        // которая указывает, какая длинна массива на текущий момент.
        int lengthSchoolBagPrototype = schoolBagPrototype.length; //Можно
        System.out.println("Количество ячеек в портфеле schoolBagPrototype: " + lengthSchoolBagPrototype);
        //Попытаемся вывести содержимое массива.
        System.out.println("Пробуем вывести содержимое массива: " + schoolBagPrototype);
        System.out.println("Пробуем вывести содержимое массива: " + schoolBagPrototype.toString());
        System.out.println("К сожалению мы видим только какие то технические данные...");
        //Попробуем вынуть из массива каждый элемент отдельно.
        String item1; //Создаём строковую переменную для каждого элемента массива schoolBagPrototype.
        String item2; //Мы заранее знаем, что элементов 4штуки.
        String item3; //Поэтому создаём 4 строковых переменных.
        String item4;
        //Попробуем достать из массива элементы и присвоить их нашим новым переменным.
        item1 = schoolBagPrototype[0]; //Обращаемся к конкретной ячейки объекту массива.
        item2 = schoolBagPrototype[1]; //Будьте внимательны, нумерация ячеек в массиве автоматически начинается с 0
        item3 = schoolBagPrototype[2];
        item4 = schoolBagPrototype[3];
        //Теперь выведем на консоль значения переменных.
        System.out.println("Содержимое массива schoolBagPrototype было таким:\n" +
                item1 +"\n" + item2 + "\n" + item3 + "\n" + item4);

        //Теперь вернёмся к массиву schoolBag, который создан на 6 ячеек и пока пустой.
        //Заполним его из "Домашнего шкафа", то есть из поля класса HomeBox, а точнее у нас уже есть его объект homeBox.
        //Поле объекта homeBox запривачено, но доступ возможен через геттеры, сеттеры.
        schoolBag[0] = homeBox.getBoxWithPens();
        schoolBag[1] = homeBox.getBoxWithPencils();
        schoolBag[2] = homeBox.getBoxWithRulers();
        schoolBag[3] = homeBox.getBoxWithSchoolDiaries();
        schoolBag[4] = homeBox.getMathematicsNotebook();
        schoolBag[5] = homeBox.getMathematicsTextbook();
        //schoolBag[6] = homeBox.getBoxWithPens(); //Будет ошибка, в программировании это называется "Исключение"

        //Теперь нам нужно вывести значения массива schoolBag на экран.
        //Можно повторно использовать уже объявленные переменные item

        String item5;      //Но нам не хватает ещё двух, так как у нас в этом массиве 6 элементов.
        String item6;
        //System.out.println("#1" + item1);

        //Заполняем переменные содержимым из массива.
        item1 = schoolBag[0]; //Обращаемся к конкретной ячейки объекту массива.
        //System.out.println("#2" + item1);
        item2 = schoolBag[1]; //Будьте внимательны, нумерация ячеек в массиве автоматически начинается с 0
        item3 = schoolBag[2];
        item4 = schoolBag[3];
        item5 = schoolBag[4];
        item6 = schoolBag[5];

        //Выводим значения переменных на консоль.
        System.out.println("Содержимое массива schoolBag было таким:\n" +
                item1 +"\n" + item2 + "\n" + item3 + "\n" + item4+ "\n" + item5+ "\n" + item6);

        int a[] = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 100;

        int b[] = new int[]{1,2,3,4,5};

        //Задача данного примера, рассмотреть как работает массив. У массива есть "Старший брат" - Коллекция.
        //Что такое Коллекция и что такое Исключение мы будем изучать на следующих уроках.
        //Но хочу приоткрыть занавес относительно понятия "Коллекция".
    }
}
