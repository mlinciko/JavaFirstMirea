package ru.mirea.task3.opt1;

public class Circle {
    private int radius;
    private String color;
    public Circle(){
        this.radius = 0;
        this.color = "";
    }
    public Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public int getDiameter(){
        return (this.radius)*2;
    }
    public String toString(){
        return "Radius: "+ this.radius+", Color: "+this.color;
    }
}
