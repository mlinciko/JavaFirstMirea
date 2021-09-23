package ru.mirea.task4.opt2;

public class BallTest {
    public static void main(String[] args)
    {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(2.3, 5.9);
        ball1.setXY(1.3, 0.55);
        ball2.move(1.0,2.0);
        System.out.println(ball1);
        System.out.println(ball2);
    }
}
