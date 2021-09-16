package ru.mirea.task3.opt2;

public class Human {
    public static void main(String[] args){
        Head head = new Head("blue", "blond");
        Hand handRight = new Hand("right" ,17.5f);
        Hand handLeft = new Hand("left", 17.3f);
        Leg legRight = new Leg("right" , 42);
        Leg legLeft = new Leg("left", 42);
        System.out.println("Human:");
        System.out.println(head);
        System.out.println(handRight);
        System.out.println(handLeft);
        System.out.println(legRight);
        System.out.println(legLeft);
    }
}
