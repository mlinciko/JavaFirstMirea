package ru.mirea.task2.opt1;

import ru.mirea.task2.opt1.Shape;

public class ShapeTest {
    public static void main(String[] args){
        Shape shape1 = new Shape(20,10,"square");
        Shape shape2 = new Shape();
        shape2.setWidth(10);
        shape2.setHeight(60);
        shape2.setType("rectangle");
        System.out.println(shape1);
        System.out.println(shape2);
    }
}
