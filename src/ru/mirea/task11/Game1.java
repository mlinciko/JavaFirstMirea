package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game1 extends JFrame {
    //надпись
    JLabel label = new JLabel("Угадайте число от 0 до 20");
    // Текстовые поля
    JTextField digit;
    int count = 0;

    public Game1() {
        super("Угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Создание рандомного числа от 0 до 20
        int random_digit = (int)(Math.random()*20)+0;
        System.out.println(random_digit);

        // Создание текстовых полей
        digit = new JTextField(15);
        digit.setToolTipText("Короткое поле");


        // Слушатель окончания ввода
        digit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // в переменную присваивается введенный текст
                int input_digit = Integer.parseInt(digit.getText());
                count++;

                if(count == 3){
                    JOptionPane.showMessageDialog(Game1.this,
                            "Game over!");
                    dispose();
                }
                // Отображение введенного текста
                else if (random_digit == input_digit){
                    JOptionPane.showMessageDialog(Game1.this,
                            "Вы угадали! Число " + input_digit);
                    dispose();

                } else if (random_digit > input_digit) {
                    JOptionPane.showMessageDialog(Game1.this,
                            "Вы ошиблись! Число должно быть больше");
                } else if (random_digit < input_digit) {
                    JOptionPane.showMessageDialog(Game1.this,
                            "Вы ошиблись! Число должно быть меньше");
                }
            }
        });

        // Создание панели с текстовыми полями
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contents.add(label);
        contents.add(digit);
        setContentPane(contents);

        // Определяем размер окна и выводим его на экран
        setSize(400, 130);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Game1();
    }
}
