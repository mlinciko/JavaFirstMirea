package ru.mirea.task8;
/*import javax.swing.*;
import java.awt.*;

public class GifFrame extends JComponent {
    public static void createGUI(){
        JFrame frame = new JFrame("Test frame");
        frame.setSize(1000,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int i = 0;
        while(i != 1000)
        {
            JLabel image1 = new JLabel(new ImageIcon("C:\\animation1.png"));
            frame.add(image1);
            JLabel image2 = new JLabel(new ImageIcon("C:\\animation2.png"));
            frame.add(image2);
            JLabel image3 = new JLabel(new ImageIcon("C:\\animation3.png"));
            frame.add(image3);
            JLabel image4 = new JLabel(new ImageIcon("C:\\animation4.png"));
            frame.add(image4);
            JLabel image5 = new JLabel(new ImageIcon("C:\\animation5.png"));
            frame.add(image5);
            JLabel image6 = new JLabel(new ImageIcon("C:\\animation6.png"));
            frame.add(image6);
            i++;
        };
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
}*/
import java.awt.*;
import java.awt.event.*;

class Animation extends Frame
{
    private Image[] img=new Image[5];
    private int count;
    Animation (String s)
    {
        super(s);
        MediaTracker tr=new MediaTracker(this);
        for (int k=0; k<5; k++)
        {
            img[k]=getToolkit().getImage("C:\\Users\\animation"+(k+1)+".png");
            tr.addImage(img[k],0);
        }
        /*try
        {
            tr.waitForAll();
        }
        catch (InterruptedException e){};*/

        setSize(300, 300);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawImage(img[count%5], 50, 50, this);
    }
    public void update(Graphics g) {paint(g); }
    public void go()
    {
        while(count<1000)
        {
            repaint();
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e){}
            count++;
        }
    }
    public static void main(String[] args)
    {
        Animation anim_window=new Animation("Simple Animation");
        anim_window.go();
        anim_window.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ev)
            {
                System.exit(0);
            }
        });
    }
}

