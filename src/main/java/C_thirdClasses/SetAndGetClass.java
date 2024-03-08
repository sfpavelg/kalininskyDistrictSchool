package C_thirdClasses;

public class SetAndGetClass {
    DataClass dataClass = new DataClass();
    SetAndGetClass(){}

    void teacherChecksWork(){
        System.out.println("Учитель проверяет работы.");
        String verificationWork;
        verificationWork = dataClass.getVerificationWorkOptionOne();
        System.out.println(verificationWork);
        System.out.println("----------------------------------------------------------------------------");
        verificationWork = dataClass.getVerificationWorkOptionTwo();
        System.out.println(verificationWork);
        System.out.println("----------------------------------------------------------------------------");
        verificationWork = dataClass.getVerificationWorkOptionThree();
        System.out.println(verificationWork);
        System.out.println("----------------------------------------------------------------------------");
        verificationWork = dataClass.getVerificationWorkOptionFour();
        System.out.println(verificationWork);
        System.out.println("============================================================================");
    }

    void schoolboyOneWrites() {
        System.out.println("Первый ученик берёт со стола учителя Проверочную работу с вариантом №1.");
        String verificationWork;
        verificationWork = dataClass.getVerificationWorkOptionOne();
        System.out.println(verificationWork);
        System.out.println("Выполнение проверочной работы №1.");
        verificationWork = "Вариант№1. Был вопрос: Основные правила объявления класса?" +
                "\nОтвет:" +
                "\n1.Модификатор доступа." +
                "\n2.Ключевое слово class." +
                "\n3.Название класса с заглавной буквы в стиле \"Верблюд\"." +
                "\n4.Название класса отражает суть функциональности класса." +
                "\n5.Тело класса{}.\n5.Название файла совпадает с названием класса." +
                "\n6.Название пакета package совпадает с пакетом где он лежит.";
        dataClass.setVerificationWorkOptionOne(verificationWork);
//        System.out.println(verificationWork);
        System.out.println("Первый ученик сдал Проверочную работу с вариантом №1.");
        System.out.println("============================================================================");
    }

    void schoolboyTwoWrites() {
        System.out.println("Первый ученик берёт со стола учителя Проверочную работу с вариантом №2.");
        String verificationWork = dataClass.getVerificationWorkOptionTwo(); //Сразу объявление переменной и присвоение значения.
        System.out.println(verificationWork);
        System.out.println("Выполнение проверочной работы №2.");
        verificationWork = "Вариант№2. Был вопрос: Как объявляется числовая переменная?" +
                "\nОтвет:" +
                "\nУченик не справился.";
        dataClass.setVerificationWorkOptionTwo(verificationWork);
        System.out.println("Первый ученик сдал Проверочную работу с вариантом №2.");
        System.out.println("============================================================================");
    }

    void schoolboyThreeWrites() {
        System.out.println("Первый ученик берёт со стола учителя Проверочную работу с вариантом №3.");
        //Вывод в терминал текущего значения переменной verificationWorkOptionThree без создания промежуточной переменной
        System.out.println(dataClass.getVerificationWorkOptionThree());
        System.out.println("Выполнение проверочной работы №3.");
        String verificationWork = "Вариант№3. Был вопрос: Как объявляется числовая переменная?" +
                "\nОтвет:" +
                "\nУченик не справился.";
        dataClass.setVerificationWorkOptionThree(verificationWork);
        System.out.println("Первый ученик сдал Проверочную работу с вариантом №3.");
        System.out.println("============================================================================");
    }

    void schoolboyFourWrites() {
        System.out.println("Первый ученик берёт со стола учителя Проверочную работу с вариантом №4.");
        System.out.println(dataClass.getVerificationWorkOptionFour());
        System.out.println("Выполнение проверочной работы №4.");
        //Теперь в сеттер мы передаём данные, не создавая промежуточной переменной.
        dataClass.setVerificationWorkOptionFour("Вариант№4. Был вопрос: Как объявляется числовая переменная?" +
                "\nОтвет:" +
                "\nУченик не справился.");
        System.out.println("Первый ученик сдал Проверочную работу с вариантом №4.");
        System.out.println("============================================================================");
    }
}
