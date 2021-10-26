package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game2 extends JFrame {
    //надпись
    JLabel labelCenter = new JLabel("                                   CENTER");
    JLabel labelWest = new JLabel("WEST");
    JLabel labelEast = new JLabel("East");
    JLabel labelNorth = new JLabel("                                             NORTH");
    JLabel labelSouth = new JLabel("                                             SOUTH");

    public Game2(){
        super("События для мыши");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //добавление надрисей
        add(labelCenter, BorderLayout.CENTER);
        add(labelWest, BorderLayout.WEST);
        add(labelEast, BorderLayout.EAST);
        add(labelNorth, BorderLayout.NORTH);
        add(labelSouth, BorderLayout.SOUTH);


        //добавление действий при наведении на надпись
        labelCenter.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в CENTER");
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        labelWest.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в WEST");
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        labelEast.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в EAST");
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        labelNorth.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в NORTH");
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        labelSouth.addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в SOUTH");
            }
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        // Определяем размер окна и выводим его на экран
        setSize(400, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Game2();
    }
}
