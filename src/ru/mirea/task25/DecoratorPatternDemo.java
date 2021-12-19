package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args){
        Shape circle = new Circle();
        RedShapeDecorator circleDec = new RedShapeDecorator(circle);
        circleDec.setRedBorder();
        circleDec.draw();
        System.out.println();

        Shape rect = new Rectangle();
        RedShapeDecorator rectDec = new RedShapeDecorator(rect);
        rectDec.setRedBorder();
        rectDec.draw();
    }
}
