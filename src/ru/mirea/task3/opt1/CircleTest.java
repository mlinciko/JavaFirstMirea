package ru.mirea.task3.opt1;

public class CircleTest {
    public static void main(String[] args){
        Circle circle1 = new Circle(3,"white");
        Circle circle2 = new Circle();
        circle2.setRadius(30);
        circle2.setColor("red");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println("Diameter of circle2: " + circle2.getDiameter());
    }
}
