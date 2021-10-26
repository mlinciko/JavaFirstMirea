package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game3 extends JFrame{
    //поле ввода
    JTextArea textArea = new JTextArea("Введите текст",2, 20);

    //панели
    JPanel[] pnl = new JPanel[9];
    //JPanel mainPanel = new JPanel();

    //надписи
    JLabel lbl1 = new JLabel("Выберите цвет");
    JLabel lbl2 = new JLabel("Выберите шрифт");

    //конпки выбора цвета
    JButton btn1 = new JButton("Green");
    JButton btn2 = new JButton("Red");
    JButton btn3 = new JButton("Yellow");
    //кнопки выбора шрифта
    JButton btn4 = new JButton("Dialog");
    JButton btn5 = new JButton("monospaced");
    JButton btn6 = new JButton("Serif");

    public Game3(){
        super("Выбор цвета и шрифта");
        //setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        setLayout(new GridLayout(9,1));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea.setFont(new Font("monospaced", Font.PLAIN,14));

        //добавление панелей
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        String inputText = textArea.getText();
        System.out.println(inputText);
        //устанавливает цвет при клике на кнопку 1
        btn1.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                textArea.setForeground(Color.GREEN);
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        btn2.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                textArea.setForeground(Color.RED);
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        btn3.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                textArea.setForeground(Color.YELLOW);
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        //устанавливает шрифт при клике на кнопку
        btn4.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                textArea.setFont(new Font("Dialog", Font.PLAIN,14));
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        btn5.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                textArea.setFont(new Font("monospaced", Font.PLAIN,14));
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        btn6.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a)
            {
                textArea.setFont(new Font("Serif", Font.ITALIC,14));
            }
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        //добавляем поля в окно
        pnl[0].setLayout(new FlowLayout());
        pnl[0].add(textArea);
        //добавление надписи
        pnl[1].setLayout(new FlowLayout());
        pnl[1].add(lbl1);
        //добавление кнопок цвета
        pnl[2].setLayout(new FlowLayout());
        pnl[2].add(btn1);
        pnl[3].setLayout(new FlowLayout());
        pnl[3].add(btn2);
        pnl[4].setLayout(new FlowLayout());
        pnl[4].add(btn3);
        //добавление надписи
        pnl[5].setLayout(new FlowLayout());
        pnl[5].add(lbl2);
        //добавление кнопок шрифта
        pnl[6].setLayout(new FlowLayout());
        pnl[6].add(btn4);
        pnl[7].setLayout(new FlowLayout());
        pnl[7].add(btn5);
        pnl[8].setLayout(new FlowLayout());
        pnl[8].add(btn6);

        // Определяем размер окна и выводим его на экран
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Game3();
    }
}
