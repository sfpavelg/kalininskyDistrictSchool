package G_logicalAndConditionalOperators;

public class SchoolBagAndLogicalOperators {
    HomeBox homeBox = new HomeBox(); //Создали экземпляр домашнего шкафа.

    public SchoolBagAndLogicalOperators() {
        completingSchoolBag();                  //в котором вызываем на исполнение метод собирающий портфель.
    }

    void completingSchoolBag() {  //Объявили метод собирающий портфель.
        System.out.println("Стандартная комплектность портфеля:");
        String pens = homeBox.getBoxWithPens();              //Объявляем переменные, которые заполняем предметами,
        String pencils = homeBox.getBoxWithPencils();        //взятыми из домашнего шкафа,
        String rulers = homeBox.getBoxWithRulers();          //с помощью гет-методов.
        String diaries = homeBox.getBoxWithSchoolDiaries();  //мы не знаем заранее, есть ли в наличии предметы в шкафу.

        System.out.println(pens);                            //Это стандартный вывод на консоль предметов,
        System.out.println(pencils);                         //которые мы вынули из шкафа.
        System.out.println(rulers);
        System.out.println(diaries);
        System.out.println("====================================");

//        //Вариант №3 из класса SchoolBagAndConditionalOperators возьмём за основу и перепишем его используя логические операторы.
//        if (pens == null) {
//            System.out.println("Ты забыл ручку!");
//        } else {
//            if (pencils == null) {
//                System.out.println("Ты забыл карандаш!");
//            } else {
//                if (rulers == null) {
//                    System.out.println("Ты забыл линейку!");
//                } else {
//                    if (diaries == null) {
//                        System.out.println("Ты забыл дневник!");
//                    } else {
//                        System.out.println("Портфель укомплектован!");
//                    }
//                }
//            }
//        }

        System.out.println("================================================");
        //используем логический оператор "или"
        if (pens == null | pencils == null | rulers == null | diaries == null){
            System.out.println("Портфель не укомплектован!");
        } else {
            System.out.println("Портфель  укомплектован!");
        }
        System.out.println("================================================");
        //используем логический оператор короткое "или"
        if (pens == null || pencils == null || rulers == null || diaries == null){
            System.out.println("Портфель не укомплектован!");
        }
        System.out.println("================================================");

        //используем логический оператор "и"
        if (pens != null & pencils != null & rulers != null & diaries != null){
            System.out.println("Портфель  укомплектован!");
        }
        System.out.println("================================================");
        //используем логический оператор короткое "и"
        if (pens == null && pencils == null && rulers == null && diaries == null){
            System.out.println("Портфель не укомплектован!");
        }
        System.out.println("================================================");

        //используем логический оператор короткое "или" и логический оператор "не"
        if (pens != null || pencils != null || rulers != null || diaries != null){
            System.out.println("Портфель укомплектован полностью!");
        }
        System.out.println("================================================");

    }
}
