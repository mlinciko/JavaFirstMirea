package ru.mirea.task14;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {
    public static String game(Stack<Integer> stackFirst, Stack<Integer> stackSecond, int amount){
        if(stackFirst.empty()) return "second "+amount;
        else if(stackSecond.empty()) return "first "+amount;
        else{
            //если карта первого игрока больше карты второго
            if(((stackFirst.firstElement() > stackSecond.firstElement()) && ((stackFirst.firstElement()!=9) && (stackSecond.firstElement()!=0))) || ((stackFirst.firstElement()==0) && (stackSecond.firstElement()==9))){
                stackFirst.push(stackFirst.firstElement());
                stackFirst.push(stackSecond.firstElement());
                stackFirst.remove(0);
                stackSecond.remove(0);
            }
            else if ((stackFirst.firstElement() < stackSecond.firstElement()) || ((stackFirst.firstElement()==9) && (stackSecond.firstElement()==0))){
                stackSecond.push(stackFirst.firstElement());
                stackSecond.push(stackSecond.firstElement());
                stackFirst.remove(0);
                stackSecond.remove(0);
            }
            amount++;
            if(amount != 106)
                return game(stackFirst, stackSecond, amount);
            else return "botva";
        }
    }
    public static Stack<Integer> createStack(String str){
        //создаем стек
        Stack<Integer> stack = new Stack();

        //разделение строки на отдельные значения
        String[] arrString = new String[5];
        arrString = str.split("\\s");
        //преобразование в строк в int и добавление в Stack
        int[] arrInt = new int[5];
        for(int i = 0; i< 5;i++){
            arrInt[i] = Integer.parseInt(arrString[i]);
            stack.push(arrInt[i]);
        }
        return stack;
    }
    public static void main(String[] args){
        //ввод значений карт первого игрока
        System.out.println("Введите значения карт игрока 1: ");
        Scanner in1= new Scanner(System.in);
        String str1 = in1.nextLine();
        //стек для первого игрока
        Stack<Integer> stackFirst = createStack(str1);

        //ввод значений карт второго игрока
        System.out.println("Введите значения карт игрока 2: ");
        Scanner in2= new Scanner(System.in);
        String str2 = in2.nextLine();
        //стек для первого игрока
        Stack<Integer> stackSecond = createStack(str2);

        System.out.println(game(stackFirst, stackSecond, 0));
    }
}
