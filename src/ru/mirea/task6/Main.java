package ru.mirea.task6;

public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog("Jack");
        Cat cat1 = new Cat("Murzik");
        Human human1 = new Human("Kristins");
        System.out.println("Dog1: "+dog1.getName());
        System.out.println("Cat1: "+cat1.getName());
        System.out.println("Human1: "+human1.getName());
    }
}
interface Nameable{
    String getName();
}
class Dog implements Nameable{
    private String name;
    public Dog(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
class Human implements Nameable{
    private String name;
    public Human(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
class Cat implements Nameable{
    private String name;
    public Cat(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}