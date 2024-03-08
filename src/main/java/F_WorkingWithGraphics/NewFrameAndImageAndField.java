package F_WorkingWithGraphics;

import javax.swing.*;

public class NewFrameAndImageAndField extends JFrame{
    private final String IMAGE_PATH = "src/main/java/images/Стиль аниме 5.jpg"; // Относительный путь к изображению. Объявляем переменную константой.
    private final String TITLE = "Изображение из файла"; //Константа. Заголовок.
    ImageIcon icon; //Переменная для объекта ImageIcon.
    JLabel label; //Переменная для объекта JLabel.

    public NewFrameAndImageAndField() {
        setTitle(TITLE); //добавили метод, который устанавливает заголовок
        setSize(1000, 1000); //В данном методе мы указываем только ширину и высоту окна. Но нет позиционирования на экране. Сработал перегруженный метод.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Определяем поведение приложения при закрытии этого окна.
        icon = new ImageIcon(IMAGE_PATH); // Создаем объект типа ImageIcon и добавляем путь к изображению.
        label = new JLabel(icon);           //JLabel - это компонент библиотеки Swing, который используется для отображения текста или иконки на JFrame или JPanel
        add(label); //Добавляем методом add() JLabel на наш JFrame
        setVisible(true); //Делаем данное окно видимым. Этот метод должен стоять обязательно в конце.
    }
}

