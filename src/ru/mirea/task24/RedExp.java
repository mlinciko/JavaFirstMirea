package ru.mirea.task24;

import java.util.Scanner;

public class RedExp {
    public static void main(String[] args){
//        String str1 ="127.0.0.1";
//        String str2 = "1300.6.7.8";

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if(str.matches("^(([1-9]?\\d|1\\d\\d|2[0-5][0-5]|2[0-4]\\d)\\.){3}([1-9]?\\d|1\\d\\d|2[0-5][0-5]|2[0-4]\\d)$"))
            System.out.println("IPv4-адрес верный");
        else System.out.println("IPv4-адрес НЕВЕРНЫЙ");
    }
}
