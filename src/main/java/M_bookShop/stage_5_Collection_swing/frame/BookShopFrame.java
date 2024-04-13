package M_bookShop.stage_5_Collection_swing.frame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import M_bookShop.stage_5_Collection_swing.logic.PublicationLogic;

public class BookShopFrame extends JFrame {
    private PublicationLogic publicationLogic;
    private JTextField titleField;
    private JTextField authorField;
    private JTextField typeField;
    private JTextField copiesField;

    public BookShopFrame(final PublicationLogic publicationLogic) {
        this.publicationLogic = publicationLogic;

        setTitle("Управление книжным магазином");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();

        // Поля ввода и их подписи
        JLabel titleLabel = new JLabel("Название публикации:");
        titleField = new JTextField(20);
        mainPanel.add(titleLabel);
        mainPanel.add(titleField);

        JLabel authorLabel = new JLabel("Автор публикации:");
        authorField = new JTextField(20);
        mainPanel.add(authorLabel);
        mainPanel.add(authorField);

        JLabel typeLabel = new JLabel("Тип публикации:");
        typeField = new JTextField(20);
        mainPanel.add(typeLabel);
        mainPanel.add(typeField);

        JLabel copiesLabel = new JLabel("Количество копий:");
        copiesField = new JTextField(5);
        mainPanel.add(copiesLabel);
        mainPanel.add(copiesField);

        JButton addButton = new JButton("Добавить публикацию");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = publicationLogic.addPublicationToCollection(titleField.getText(), authorField.getText(),
                        typeField.getText(), Integer.parseInt(copiesField.getText()));
                JOptionPane.showMessageDialog(BookShopFrame.this, result);
            }
        });
        mainPanel.add(addButton);

        JButton updateButton = new JButton("Обновить копии");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = publicationLogic.updateCopiesByTitle(titleField.getText(),
                        Integer.parseInt(copiesField.getText()));
                JOptionPane.showMessageDialog(BookShopFrame.this, result);
            }
        });
        mainPanel.add(updateButton);

        JButton deleteButton = new JButton("Удалить публикацию");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = publicationLogic.deletePublicationByTitle(titleField.getText());
                JOptionPane.showMessageDialog(BookShopFrame.this, result);
            }
        });
        mainPanel.add(deleteButton);

        JButton displayButton = new JButton("Отображение информации");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextArea displayArea = new JTextArea(10, 30);
                displayArea.setText(publicationLogic.publicationCollection.getList().toString());
                displayArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(displayArea);

                JFrame infoFrame = new JFrame("Информация о публикации");
                infoFrame.setBounds(500, 200, 1000, 700);
                infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                infoFrame.add(scrollPane);
                infoFrame.setVisible(true);
            }
        });
        mainPanel.add(displayButton);

        setContentPane(mainPanel);
        setVisible(true);
    }
}
