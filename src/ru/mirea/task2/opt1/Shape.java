package ru.mirea.task2.opt1;

public class Shape {
    private int width;
    private int height;
    private String type;
    public Shape(){
        this.width = 0;
        this.height = 0;
        this.type = "";
    }
    public Shape(int width, int height,String type){
        this.width = width;
        this.height = height;
        this.type = type;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public String getType(){
        return this.type;
    }
    public String toString(){
        return "Width: "+this.width+", Height: "+this.height +", Type: "+this.type;
    }
}
