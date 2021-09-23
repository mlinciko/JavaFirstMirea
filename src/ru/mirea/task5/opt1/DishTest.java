package ru.mirea.task5.opt1;

public class DishTest {
    public static void main(String[] args){
        Cups coffee_cup = new Cups("ceramics", "white", "for_coffee", 10.5);
        Plates soup_plate = new Plates("porcelain", "blue", "for_soup", 0.35);
        System.out.println("Cups: " + coffee_cup);
        System.out.println("Plates: "+ soup_plate);
    }
}
