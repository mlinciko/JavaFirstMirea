package ru.mirea.task14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeTest {
    public static String game(Deque<Integer> dequeFirst, Deque<Integer> dequeSecond, int amount){
        if(dequeFirst.isEmpty()) return "second "+amount;
        else if(dequeSecond.isEmpty()) return "first "+amount;
        else{
            //если карта первого игрока больше карты второго
            if(((dequeFirst.peek() > dequeSecond.peek()) && ((dequeFirst.peek()!=9) && (dequeSecond.peek()!=0))) || ((dequeFirst.peek()==0) && (dequeSecond.peek()==9))){
                dequeFirst.push(dequeFirst.peek());
                dequeFirst.push(dequeSecond.peek());
                dequeFirst.remove();
                dequeSecond.remove();
            }
            else if ((dequeFirst.peek() < dequeSecond.peek()) || ((dequeFirst.peek()==9) && (dequeSecond.peek()==0))){
                dequeSecond.push(dequeFirst.peek());
                dequeSecond.push(dequeSecond.peek());
                dequeFirst.remove();
                dequeSecond.remove();
            }
            amount++;
            if(amount != 106)
                return game(dequeFirst, dequeSecond, amount);
            else return "botva";
        }
    }
    public static Deque<Integer> createDeque(String str){
        //создаем очередь
        Deque<Integer> deque = new ArrayDeque();

        //разделение строки на отдельные значения
        String[] arrString = new String[5];
        arrString = str.split("\\s");
        //преобразование в строк в int и добавление в Stack
        int[] arrInt = new int[5];
        for(int i = 0; i< 5;i++){
            arrInt[i] = Integer.parseInt(arrString[i]);
            deque.push(arrInt[i]);
        }
        return deque;
    }
    public static void main(String[] args){
        //ввод значений карт первого игрока
        System.out.println("Введите значения карт игрока 1: ");
        Scanner in1= new Scanner(System.in);
        String str1 = in1.nextLine();
        //стек для первого игрока
        Deque<Integer> dequeFirst = createDeque(str1);

        //ввод значений карт второго игрока
        System.out.println("Введите значения карт игрока 2: ");
        Scanner in2= new Scanner(System.in);
        String str2 = in2.nextLine();
        //стек для первого игрока
        Deque<Integer> dequeSecond = createDeque(str2);

        System.out.println(game(dequeFirst, dequeSecond, 0));
    }
}
