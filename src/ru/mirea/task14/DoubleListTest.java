package ru.mirea.task14;

import java.util.Scanner;
import java.util.*;

public class DoubleListTest {
    public static String game(LinkedList<Integer> listFirst, LinkedList<Integer> listSecond, int amount){
        if(listFirst.isEmpty()) return "second "+amount;
        else if(listSecond.isEmpty()) return "first "+amount;
        else{
            //если карта первого игрока больше карты второго
            if(((listFirst.getFirst() > listSecond.getFirst()) && ((listFirst.getFirst()!=9) && (listSecond.getFirst()!=0))) || ((listFirst.getFirst()==0) && (listSecond.getFirst()==9))){
                listFirst.push(listFirst.getFirst());
                listFirst.push(listSecond.getFirst());
                listFirst.remove(0);
                listSecond.remove(0);
            }
            else if ((listFirst.getFirst() < listSecond.getFirst()) || ((listFirst.getFirst()==9) && (listSecond.getFirst()==0))){
                listSecond.push(listFirst.getFirst());
                listSecond.push(listSecond.getFirst());
                listFirst.remove(0);
                listSecond.remove(0);
            }
            amount++;
            if(amount != 106)
                return game(listFirst, listSecond, amount);
            else return "botva";
        }
    }
    public static LinkedList<Integer> createList(String str){
        //создаем стек
        LinkedList<Integer> list = new LinkedList();

        //разделение строки на отдельные значения
        String[] arrString = new String[5];
        arrString = str.split("\\s");
        //преобразование в строк в int и добавление в Stack
        int[] arrInt = new int[5];
        for(int i = 0; i< 5;i++){
            arrInt[i] = Integer.parseInt(arrString[i]);
            list.push(arrInt[i]);
        }
        return list;
    }
    public static void main(String[] args){
        //ввод значений карт первого игрока
        System.out.println("Введите значения карт игрока 1: ");
        Scanner in1= new Scanner(System.in);
        String str1 = in1.nextLine();
        //стек для первого игрока
        LinkedList<Integer> listFirst = createList(str1);

        //ввод значений карт второго игрока
        System.out.println("Введите значения карт игрока 2: ");
        Scanner in2= new Scanner(System.in);
        String str2 = in2.nextLine();
        //стек для первого игрока
        LinkedList<Integer> listSecond = createList(str2);

        System.out.println(game(listFirst, listSecond, 0));
    }
}
