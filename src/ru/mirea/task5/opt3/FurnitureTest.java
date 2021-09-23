package ru.mirea.task5.opt3;

public class FurnitureTest {
    public static void main(String[] args){
        Locker office_locker = new Locker("wood", "brown", "for_office", 2.1);
        Bed sleeping_bed = new Bed("wood", "white", "for_bedroom", 1.6);
        System.out.println("Locker: " + office_locker);
        System.out.println("Bed: "+ sleeping_bed);
    }
}