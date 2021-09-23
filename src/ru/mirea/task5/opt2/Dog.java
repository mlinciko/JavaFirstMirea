package ru.mirea.task5.opt2;

public abstract class Dog {
    private int age;
    private String name;
    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
class Spaniel extends Dog{
    private String color;
    private double lengthOfYears;
    public Spaniel(int age, String name, String color, double lengthOfYears){
        super(age, name);
        this.color = color;
        this.lengthOfYears = lengthOfYears;
    }
    public String toString(){
        return "Age: "+super.getAge()+", Name: " + super.getName()+", Color: "+this.color +", Lehgth of years: "+this.lengthOfYears;
    }
}
