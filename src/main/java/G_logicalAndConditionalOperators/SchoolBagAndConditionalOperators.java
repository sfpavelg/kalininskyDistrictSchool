package G_logicalAndConditionalOperators;

/*
Представим, что школьный портфель собирает манипулятор.
Предметы берёт из домашнего шкафа HomeBox.
Но может возникнуть такая ситуация, что в шкафу предметы закончились.
Манипулятор совершит действие, но ни чего в портфель не положит.
Нам этот момент как то нужно отследить.
 */
public class SchoolBagAndConditionalOperators { //Объявили класс.
    HomeBox homeBox = new HomeBox(); //Создали экземпляр домашнего шкафа.

    public SchoolBagAndConditionalOperators() { //Объявили конструктор,
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

        //Вместо вывода на консоль, устроим проверку. Вариант №1. С фигурными скобками.
//        if (pens == null) {     //Если переменной: pens в домашнем шкафу HomeBox не присваивалось значение, то оно по умолчанию равно null.
//            System.out.println("Ты забыл ручку!");
//        } else {
//            System.out.println(pens);
//        }
//
//        if (pencils == null) {
//            System.out.println("Ты забыл карандаш!");
//        } else {
//            System.out.println(pencils);
//        }
//
//        if (rulers == null) {
//            System.out.println("Ты забыл линейку!");
//        } else {
//            System.out.println(rulers);
//        }
//
//        if (diaries == null) {
//            System.out.println("Ты забыл дневник!");
//        } else {
//            System.out.println(diaries);
//        }


//        //Вместо вывода на консоль, устроим проверку. Вариант №2. Без фигурных скобок.
//        if (pens == null)
//            System.out.println("Ты забыл ручку!");
//        else
//            System.out.println(pens);
//
//
//        if (pencils == null)
//            System.out.println("Ты забыл карандаш!");
//        else
//            System.out.println(pencils);
//
//
//        if (rulers == null)
//            System.out.println("Ты забыл линейку!");
//        else
//            System.out.println(rulers);
//
//
//        if (diaries == null)
//            System.out.println("Ты забыл дневник!");
//        else
//            System.out.println(diaries);


        //Вместо вывода на консоль, устроим проверку. Вариант №3. Вложенный if.
        if (pens == null) {
            System.out.println("Ты забыл ручку!");
        } else {
            if (pencils == null) {
                System.out.println("Ты забыл карандаш!");
            } else {
                if (rulers == null) {
                    System.out.println("Ты забыл линейку!");
                } else {
                    if (diaries == null) {
                        System.out.println("Ты забыл дневник!");
                    } else {
                        System.out.println("Портфель укомплектован!");
                    }
                }
            }
        }

    }
}
