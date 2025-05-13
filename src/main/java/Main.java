import C_thirdClasses.StartSetAndGetClass;
import F_workingWithGraphics.*;

public class Main {
    public static void main(String[] args) {

        /**
         * Задача: напиши код, который цифры в числе 12345 меняет в обратном порядке.
         */


        int d = 12345;                                     //1. Объявили число
        String dStr = Integer.toString(d);                 //2. Преобразовали в строку

        for (int j = dStr.length() - 1; j >= 0; j--) {     //3. Объявили цикл
            char ch = dStr.charAt(j);                      //4. метод charAt(j) позволяет взять из строки символ по идентификатору (начинаем с конца)
            System.out.print(ch);                          //5. Печатаем символ, без перевода строки.
        }


    }
}
