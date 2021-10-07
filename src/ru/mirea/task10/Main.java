package ru.mirea.task10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //task 2
        System.out.println("Введите n: ");
        Scanner in1 = new Scanner(System.in);
        int n = in1.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        //task 3
        System.out.println("Введите A: ");
        Scanner in2 = new Scanner(System.in);
        int A = in2.nextInt();
        System.out.println("Введите B: ");
        Scanner in3 = new Scanner(System.in);
        int B = in3.nextInt();
        if(A < B){
            for(int i = A; i <= B; i++){
                System.out.println(i);
            }
        }
        else{
            for(int i = A; i >= B;i-- ){
                System.out.println(i);
            }
        }
        //task 4
        System.out.println("Введите k: ");
        Scanner in4 = new Scanner(System.in);
        int k = in4.nextInt();
        System.out.println("Введите s: ");
        Scanner in5 = new Scanner(System.in);
        int s = in5.nextInt();
        int digits = amountOfDigits(k);
        int startDigit = 1;
        for(int i = 0; i < digits; i++)
            startDigit *= 10;
        int endDigit = 1;
        for(int i =0; i < digits+1;i++)
            endDigit *= 10;
        int amount=0;
        for(int i = startDigit;i < endDigit-1;i++){
            if(sumOfDigits(i) == s){
                amount++;
            }
        }
        System.out.println("Существует "+amount+" натуральных "+digits+"-значных чисел, сумма котрых равна "+ s);
    }
    static int amountOfDigits(int n){
        int digits = 0;
        while(n > 0){
            digits++;
            n = n / 10;
        }
        return digits;
    }
    static int sumOfDigits(int n){
        int sum = 0;
        int digit;
        while(n > 0){
            digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
}
