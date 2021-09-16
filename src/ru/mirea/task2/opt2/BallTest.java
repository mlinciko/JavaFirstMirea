package ru.mirea.task2.opt2;

public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball(10, "red", "football");
        Ball ball2 = new Ball(25, "white", "basketball");
        Ball ball3 = new Ball();
        ball3.setRadius(15);
        ball3.setColor("orange");
        ball3.setType("none");
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        ball1.whatType();
        ball2.whatType();
        ball3.whatType();
    }
}
