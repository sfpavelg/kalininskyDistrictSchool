package E_B_Stackc_Heap_Return.auto.Robots;

public abstract class Сборщик {
    int id;
    Сборщик(int id){
        this.id = id;
    }

    public abstract void СобираетВсёЧтоВРкиДашь(String чтоСобираем, int количество);
}
