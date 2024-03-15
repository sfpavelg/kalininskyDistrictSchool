package F_WorkingWithGraphics;

import javax.swing.*;

public class NewFrameAndImage extends JFrame {
    public NewFrameAndImage() {
        setTitle("Изображение из файла"); //добавили метод, который устанавливает заголовок
        setSize(1000, 1000); //В данном методе мы указываем только ширину и высоту окна. Но нет позиционирования на экране. Сработал перегруженный метод.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Определяем поведение приложения при закрытии этого окна.

        String imagePath = "src/main/java/Z_images/Стиль аниме 5.jpg"; // Относительный путь к изображению
        //String imagePath = "C:\\Users\\Papa\\IdeaProjects\\kalininskyDistrictSchool\\src\\main\\java\\Z_images\\Стиль аниме 5.jpg"; // Абсолютный путь к изображению

        System.out.println("Текущий каталог: " + System.getProperty("user.dir")); // так можно узнать текущий каталог.

        ImageIcon icon = new ImageIcon(imagePath); // Создаем объект типа ImageIcon и добавляем путь к изображению.

        JLabel label = new JLabel(icon);           //JLabel - это компонент библиотеки Swing, который используется для отображения текста или иконки на JFrame или JPanel
        // JLabel позволяет создавать метки или надписи, которые могут отображать статический текст или изображения.

        add(label); //Добавляем методом add() JLabel на наш JFrame

        setVisible(true); //Делаем данное окно видимым. Этот метод должен стоять обязательно в конце.
    }
}

