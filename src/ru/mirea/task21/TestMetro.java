package ru.mirea.task21;

public class TestMetro {
    public static void main(String[] args){
        Metro lines = new Metro();
        System.out.println("Нечетные линии метро: ");
        lines.PrintList(true);
        System.out.println("Четные линии метро: ");
        lines.PrintList(false);
    }
}
