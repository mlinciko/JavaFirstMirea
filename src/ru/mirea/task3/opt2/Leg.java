package ru.mirea.task3.opt2;

public class Leg {
    private String type;
    private int sizeOfFoot;
    public Leg(){
        this.type = "right";
        this.sizeOfFoot = 38;
    }
    public Leg(String type, int sizeOfFoot){
        this.type = type;
        this.sizeOfFoot = sizeOfFoot;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setSizeOfFoot(int sizeOfFoot){
        this.sizeOfFoot = sizeOfFoot;
    }
    public String getType(){
        return this.type;
    }
    public int getSizeOfFoot(){
        return this.sizeOfFoot;
    }
    public String toString(){
        return "Leg "+ this.type + ": Size of a foot "+ this.sizeOfFoot;
    }
}
