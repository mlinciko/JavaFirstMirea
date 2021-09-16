package ru.mirea.task3.opt2;

public class Head {
    private String colorOfEyes;
    private String colorOfHair;
    public Head(){
        this.colorOfEyes = "green";
        this.colorOfHair = "blond";
    }
    public Head(String colorOfEyes, String colorOfHair){
        this.colorOfEyes = colorOfEyes;
        this.colorOfHair = colorOfHair;
    }
    public void setColorOfEyes(String colorOfEyes){
        this.colorOfEyes = colorOfEyes;
    }
    public void setColorOfHair(String colorOfHair){
        this.colorOfHair = colorOfHair;
    }
    public String getColorOfEyes(){
        return this.colorOfEyes;
    }
    public String getColorOfHair(){
        return this.colorOfHair;
    }
    public String toString(){
        return "Head: Color of the eyes - "+ this.colorOfEyes + ", Color of a hair "+ this.colorOfHair;
    }
}
