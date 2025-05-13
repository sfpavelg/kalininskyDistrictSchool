package E_B_Stackc_Heap_Return_Exception_Thread.auto.robots;

public abstract class Сборщик {
    int id;
    Сборщик(int id){
        this.id = id;
    }

    public abstract void СобираетВсёЧтоВРкиДашь(String чтоСобираем, int количество);
}
