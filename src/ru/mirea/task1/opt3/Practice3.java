package ru.mirea.task1.opt3;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        for(int i = 0; i < n;i++){
            mass[i] = i;
        }
        int sum = 0;
        for(int i = 0; i < n;i++){
            sum = sum + mass[i];
        }
        System.out.println("Сумма элементов массива цикл for: " + sum);
        sum = 0;
        int i = 0;
        while(i < n){
            sum = sum + mass[i];
            i++;
        }
        System.out.println("Сумма элементов массива цикл while: " + sum);
        sum = 0;
        i = 0;
        do{
            sum = sum + mass[i];
            i++;
        }while (i < n);
        System.out.println("Сумма элементов массива цикл while: " + sum);
    }
}
