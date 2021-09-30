package ru.mirea.task7;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color = "";
        this.filled = false;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

class Circle extends Shape{
    protected double radius;
    public Circle(){
        super();
        this.radius = 0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*(Math.pow(this.radius,2));
    }
    public double getPerimeter(){
        return 2*3.14*(this.radius);
    }
    public String toString(){
        return "Color: "+super.getColor()+", Filled: "+super.isFilled()+", Radius: "+ this.radius+ ", Area: "+this.getArea()+", Perimeter: " + this.getPerimeter();
    }
}

class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){
        super();
        this.width = 0;
        this.length = 0;
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(){
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return "Color: "+super.getColor()+", Filled: "+super.isFilled()+", Width: "+ this.width+ ", Length: " +this.length+ ", Area: "+this.getArea()+", Perimeter: " + this.getPerimeter();
    }
}
class Square extends Shape{
    protected double side;
    public Square(){
        super();
        this.side = 0;
    }
    public Square(double side){
        super();
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(color,filled);
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getArea(){
        return Math.pow(this.side,2);
    }
    public double getPerimeter(){
        return (this.side)*2;
    }
    public String toString(){
        return "Color: "+super.getColor()+", Filled: "+super.isFilled()+", Side: "+ this.side+ ", Area: "+this.getArea()+", Perimeter: " + this.getPerimeter();
    }
}

