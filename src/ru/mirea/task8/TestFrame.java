package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;

//класс рисования разных типов фигур
class Shape extends JComponent {
    private static final long serialVersionUID = 1L;
    private Color color;
    private int type;
    //параметры
    Shape(Color color, int type){
        this.color = color;
        this.type = type;
        setOpaque(false);
    }
    public void paintComponent(Graphics g){
        //прорисовка фигуры
        g.setColor(color);
        switch(type){
            case 0: g.fillOval(0,0,90,90); break;
            case 1: g.fillRect(0,0,130,80); break;
            case 2: g.fillRect(0,0,100,100); break;
        }
        //g.setColor(Color.yellow);
    }
}

public class TestFrame {
    public static void createGUI()
    {
        JFrame frame = new JFrame("Test frame");
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //создание фигуры
        for(int i = 0; i < 20 ;i++)
        {
           int chooseColor = (int)(Math.random() * 3) + 0;
           System.out.println(chooseColor);
           switch(chooseColor)
           {
               case 0:
               {
                   Shape shape = new Shape(Color.red, 0);
                   //определение местоложения в окне
                   shape.setBounds((int)(Math.random() * 850) + 0,(int)(Math.random() * 650) + 0,120,120);
                   //добавление фигур в окно
                   frame.add(shape);
                   break;
               }
               case 1:
               {
                   Shape shape = new Shape(Color.cyan, 1);
                   //определение местоложения в окне
                   shape.setBounds((int)(Math.random() * 850) + 0,(int)(Math.random() * 650) + 0,120,80);
                   //добавление фигур в окно
                   frame.add(shape);
                   break;
               }
               case 2:
               {
                   Shape shape = new Shape(Color.green, 2);
                   //определение местоложения в окне
                   shape.setBounds((int)(Math.random() * 850) + 0,(int)(Math.random() * 650) + 0,120,120);
                   //добавление фигур в окно
                   frame.add(shape);
                   break;
               }
           }
        }
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               createGUI();
           }
        });
    }
}

