package A_primaryClasses;

public class Main {
    public static void main(String[] args) {

//        Решите два примера:
//        1. Пар_ход
//        2. х + 2 = 4
//        Как вы поняли, где нужно вставить цифру, а где букву?
//        JAVA так не умеет, ей нужно указать явно, где будет буква, где будет цифра.
        int x;
        x = 2;

        System.out.println(FirstClass.name);
        FirstClass.schoolboyOneWrites();

        FirstClass firstClass1A;
        firstClass1A = new FirstClass();

        firstClass1A.schoolboyOneWrites();
        firstClass1A.schoolboyTwoWrites();
        firstClass1A.schoolboyThreeWrites();
        firstClass1A.schoolboyFourWrites();
        System.out.println(firstClass1A.age);
        System.out.println(firstClass1A);
        System.out.printf("Павел", " + ", "Марина");

//
//        System.out.println();
//        System.out.println("=================================");
//
//        FirstClass firstClass1B = new FirstClass();
//        firstClass1B.schoolboyOneWrites();

//        new StartOfLessonsInPrimaryClass();
        //new FirstClass();
//        SecondClass secondClass = new SecondClass();
//        secondClass.schoolboyOneWrites();

//FirstClass firstClass = new FirstClass("Премия ", 200000);
//FirstClass firstClass1 = new FirstClass("Премия+ЗП ", 45000, 200000);








    }

}
