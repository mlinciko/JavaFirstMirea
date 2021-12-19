package ru.mirea.task25;

interface Shape { public void draw(); }
class Circle implements Shape {
    public void draw() { System.out.println("Circle"); }
}

class Rectangle implements Shape {
    public void draw() { System.out.println("Rectangle"); }
}

abstract class ShapeDecorator {
    public Shape shape;

    public ShapeDecorator(Shape shape) { this.shape = shape; }
    public abstract void draw();
}

class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) { super(shape); }
    public void draw() { shape.draw(); }
    void setRedBorder() { System.out.println("Border - red"); }
}

