package A_primaryClasses;

import java.sql.SQLOutput;

//
class FirstClass {
      public FirstClass(String p, int n){
          System.out.println(sumInt(p,n));
    }
    public FirstClass(String p, int n, int k){
          System.out.println(sumInt(p,n, k));
    }


    void schoolboyOneWrites() {
        System.out.print("Хочу"); //Мальчик пишет
    }

    void schoolboyTwoWrites() {

        System.out.print(" быть");
    }

    void schoolboyThreeWrites() {

        System.out.print(" программистом");
    }

    void schoolboyFourWrites() {

        System.out.print(" JAVA");
    }


    int goblinForest() {
//        System.out.println("Иди к лесу");
//        System.out.println("Таймер");
       return 20;
    }
    int goblinGold() {
        System.out.println("Иди к лесу");
        System.out.println("Таймер");
        return 10;
    }



    String sumInt(String p, int n) {
        return p+n;
    }

    String sumInt(String p, int n, int l) {

        return p+(n+l);
    }

//    static void schoolboyFiveWrites() {
//        System.out.println();
//        System.out.print("Я самый умный Юрец");
//        System.out.println();
//    }
}

