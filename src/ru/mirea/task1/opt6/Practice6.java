package ru.mirea.task1.opt6;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args){
        System.out.println("Введите количество элементов массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        for(int i = 0; i < n; i++){
            mass[i] = ((int)(Math.random() * n) + 0);
            System.out.print(mass[i] + " ");
        }
        int temp = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1;j++){
                if(mass[j] > mass[j+1]){
                    temp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1]=temp;
                }
            }
        }
        System.out.println("\n");
        for(int i = 0; i < n; i++){
            System.out.print(mass[i] + " ");
        }
    }
}
