package F_workingWithGraphics;

import javax.swing.*;
import java.io.File;

public class NewFrameAndImageAndPathCheck extends JFrame {
    public NewFrameAndImageAndPathCheck(){
        setTitle("Изображение из файла");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //String imagePath = "src/main/java/images/Стиль аниме 5.jpg"; // Относительный путь к изображению
        String imagePath = "C:\\Users\\Papa\\IdeaProjects\\kalininskyDistrictSchool\\src\\main\\java\\Z_images\\Стиль аниме 5.jpg"; // Абсолютный путь к изображению
        System.out.println("Текущий каталог: " + System.getProperty("user.dir")); // так можно узнать текущий каталог.
        File file = new File(imagePath);

        if (file.exists()) {
            ImageIcon icon = new ImageIcon(imagePath); // Создаем ImageIcon из файла
            JLabel label = new JLabel(icon);
            add(label);
        } else {
            System.out.println("Файл с изображением не найден. Проверь путь!!!!");
        }

        setVisible(true);
    }
}
