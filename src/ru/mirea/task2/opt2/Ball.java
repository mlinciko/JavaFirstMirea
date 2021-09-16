package ru.mirea.task2.opt2;

public class Ball {
    private int radius;
    private String color;
    private String type;
    public Ball(){
        this.radius = 0;
        this.color = "blue";
        this.type = "football";
    }
    public Ball(int radius, String color, String type){
        this.radius = radius;
        this.color = color;
        this.type = type;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public String getType(){
        return this.type;
    }
    public void whatType(){
        if(this.type != null) {
            switch (this.type) {
                case ("football"):
                    System.out.println("This ball is " + this.type);
                    break;
                case ("basketball"):
                    System.out.println("This ball is " + this.type);
                    break;
                default:
                    System.out.println("Wrong type of a ball");
                    break;
            }
        }

    }
    public String toString(){
        return "Radius: "+this.radius+", Color: "+this.color+", Type: "+this.type;
    }
}
