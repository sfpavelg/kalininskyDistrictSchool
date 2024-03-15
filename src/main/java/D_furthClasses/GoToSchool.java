package D_furthClasses;

public class GoToSchool extends SchoolBag{
//    public class GoToSchool {
//        SchoolBag schoolBag = new SchoolBag();
//    HomeBox homeBox = new HomeBox();
    public GoToSchool(){
        //completingSchoolBag();
        //completingSchoolBag("Бутерброд.");
        completingSchoolBag( "Кроссовки.", "Спортивная форма.");
//        completingSchoolBag2();
//        completingSchoolBag();
        System.out.println(homeBox.getBoxWithPens());
        homeBox.setBoxWithPens("Ручка чёрная");
        System.out.println(homeBox.getBoxWithPens());
    }
    //Переопределяем содержимое первой версии комплектности портфеля.
//    @Override
//    void completingSchoolBag(){
//        System.out.println(homeBox.getMathematicsTextbook());
//        //Второй вариант обращения к полю класса HomeBox, создаётся объект, без объявления переменной.
//        System.out.println(new HomeBox().getMathematicsNotebook());
//        //
//    }

    //Дополнительный метод доукомплектации портфеля.
//    void completingSchoolBag2(){
//        System.out.println(homeBox.getMathematicsTextbook());
//        //Второй вариант обращения к полю класса HomeBox, создаётся объект, без объявления переменной.
//        System.out.println(homeBox.getMathematicsNotebook());
//
//    }
}
