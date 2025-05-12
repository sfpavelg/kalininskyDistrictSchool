package E_B_Stackc_Heap_Return.auto.Robots;

public abstract class Курьер {
    int id;
    public Курьер(int id){
        this.id = id;
    }

    public abstract int НоситВсёЧтоВРукиДашь(String чтоНосим, int количество);
}


