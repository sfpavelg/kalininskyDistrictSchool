package F_WorkingWithGraphics;

import javax.swing.*;

public class NewFrame extends JFrame {

    public NewFrame() {
        setBounds(250, 250, 300, 400); //Определяем размер окна и местоположение на экране.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Определяем поведение приложения при закрытии этого окна.
        setVisible(true);                                //Делаем данное окно видимым.
    }
}
