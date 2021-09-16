package ru.mirea.task1.opt7;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int factorial = 1;
        for(int i = 0; i < n; i++){
            factorial = factorial * (n-i);
        }
        System.out.println(factorial);
    }
}
