package J_for_while;

class ForAndWhile {
    private HomeBox homeBox;
    private String schoolBag[]; //Объявили строковый массив с названием schoolBag.
    String item1; //Создаём строковую переменную для каждого элемента массива schoolBagPrototype.
    String item2;
    String item3;
    String item4;
    String item5;
    String item6;


    ForAndWhile(){
        homeBox = new HomeBox(); //Создали экземпляр домашнего шкафа.
        schoolBag = new String[6]; //Создали объект (экземпляр) строкового массива на 6 ячеек. Но массив пока пустой.

        schoolBag[0] = homeBox.getBoxWithPens(); //заполнили массив
        schoolBag[1] = homeBox.getBoxWithPencils();
        schoolBag[2] = homeBox.getBoxWithRulers();
        schoolBag[3] = homeBox.getBoxWithSchoolDiaries();
        schoolBag[4] = homeBox.getMathematicsNotebook();
        schoolBag[5] = homeBox.getMathematicsTextbook();

        item1 = schoolBag[0]; //Обращаемся к конкретной ячейки объекту массива.
        item2 = schoolBag[1]; //Будьте внимательны, нумерация ячеек в массиве автоматически начинается с 0
        item3 = schoolBag[2];
        item4 = schoolBag[3];
        item5 = schoolBag[4];
        item6 = schoolBag[5];

        //Выводим значения переменных на консоль.
        System.out.println("Содержимое массива schoolBag было таким:\n" +
                item1 +"\n" + item2 + "\n" + item3 + "\n" + item4+ "\n" + item5+ "\n" + item6);

        System.out.println("=======   Теперь используем цикл for (for-each):  ============");
        //String item: schoolBag это тоже, что String item = schoolBag[0]; для каждого индекса поочереди
        for (String item: schoolBag){
            System.out.println(item);
        }

        System.out.println("=======   Теперь используем цикл for   ============");
        for (int i = 0; i < schoolBag.length; i++) { //i++ - это пост инкремент, это тоже, что int i; i = i + 1;
            System.out.println(schoolBag[i]);
        }

        System.out.println("=======   Теперь используем цикл while  ============");

        int i = 0;
        while (i < schoolBag.length) {
            System.out.println(schoolBag[i]);
            i++;
        }

        System.out.println("=======   Теперь используем цикл  do-while   ============");

        int j = 0;
        do {
            System.out.println(schoolBag[j]);
            j++;
        } while (j < schoolBag.length);
    }
}
