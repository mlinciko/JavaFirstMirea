package ru.mirea.task1.opt4;

public class Practice4 {
    public static void main(String[] args){
        for(int i = 0; i < args.length;i++){
            System.out.println(String.format("Argument %d: %s", i, args[i]));
        }
        System.out.println("Work!");
    }
}
