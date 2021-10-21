package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    //надпись
    JLabel label = new JLabel("Угадайте число от 0 до 20");
    // Текстовые поля
    JTextField digit;

    public Game() {
        super("Угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //setLayout(new GridLayout(2,1));
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
                int count = 0;
                while(count != 4) {
                    //выход из игры
                    if(count == 3){
                        JOptionPane.showMessageDialog(Game.this,
                                "Game over!");
                        break;
                    }
                    // Отображение введенного текста
                    if (random_digit == input_digit) {
                        JOptionPane.showMessageDialog(Game.this,
                                "Вы угадали! Число " + input_digit);
                    } else if (random_digit > input_digit) {
                        JOptionPane.showMessageDialog(Game.this,
                                "Вы ошиблись! Число должно быть больше");
                    } else if (random_digit < input_digit) {
                        JOptionPane.showMessageDialog(Game.this,
                                "Вы ошиблись! Число должно быть меньше");
                    }
                    count ++;
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
        new Game();
    }
}
