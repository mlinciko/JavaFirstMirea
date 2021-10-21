package ru.mirea.task8;
import javax.swing.*;
import java.awt.*;

public class ImageFrame extends JComponent{
    public static void main(String[] args){
        JFrame frame = new JFrame("Test frame");
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel image = new JLabel(new ImageIcon(args[0]));
        frame.add(image);
        frame.setVisible(true);
    }
}
class Compile extends ImageFrame{
    private String s;
    Compile(String s){
        this.s = s;
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        Image image = new ImageIcon(s).getImage();
        g2.drawImage(image,10,10,null);
    }
}
