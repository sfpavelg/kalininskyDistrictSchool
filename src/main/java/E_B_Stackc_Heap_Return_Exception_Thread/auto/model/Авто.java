package E_B_Stackc_Heap_Return.auto.model;

public class Авто {
    private String спецификация;
    //Что на автомобиль установлено:
    private int кузов;
    private int колёса;
    private int сиденья;
    private int мотор;


    public void setСпецификация(String спецификация) {
        this.спецификация = спецификация;
    }


    //встроенные роботы монтажники:
    public void роботУстанавливаетКузов(int кузов) {
        if (кузов > 0) {
            this.кузов = 1;
        }
    }

    public void роботУстанавливаетКолёса(int колёса) {
        if (колёса > 0) {
            this.колёса = 4;
        }
    }

    public void роботУстанавливаетСиденья(int сиденья) {
        if (сиденья > 0) {
            this.сиденья = 4;
        }
    }

    public void роботУстанавливаетМотор(int мотор) {
        if (мотор > 0) {
            this.мотор = 1;
        }
    }

    @Override
    public String toString() {
        return "Авто{" +
                "спецификация='" + спецификация + '\'' +
                ", кузов=" + кузов +
                ", колёса=" + колёса +
                ", сиденья=" + сиденья +
                ", мотор=" + мотор +
                '}';
    }
}
