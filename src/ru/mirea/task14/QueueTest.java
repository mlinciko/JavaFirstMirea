package ru.mirea.task14;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueTest {
    public static String game(Queue<Integer> queueFirst, Queue<Integer> queueSecond, int amount){
        if(queueFirst.isEmpty()) return "second "+amount;
        else if(queueSecond.isEmpty()) return "first "+amount;
        else{
            //если карта первого игрока больше карты второго
            if(((queueFirst.peek() > queueSecond.peek()) && ((queueFirst.peek()!=9) && (queueSecond.peek()!=0))) || ((queueFirst.peek()==0) && (queueSecond.peek()==9))){
                queueFirst.offer(queueFirst.peek());
                queueFirst.offer(queueSecond.peek());
                queueFirst.remove();
                queueSecond.remove();
            }
            else if ((queueFirst.peek() < queueSecond.peek()) || ((queueFirst.peek()==9) && (queueSecond.peek()==0))){
                queueSecond.offer(queueFirst.peek());
                queueSecond.offer(queueSecond.peek());
                queueFirst.remove();
                queueSecond.remove();
            }
            amount++;
            if(amount != 106)
                return game(queueFirst, queueSecond, amount);
            else return "botva";
        }
    }
    public static Queue<Integer> createQueue(String str){
        //создаем стек
        Queue<Integer> queue = new LinkedList();

        //разделение строки на отдельные значения
        String[] arrString = new String[5];
        arrString = str.split("\\s");
        //преобразование в строк в int и добавление в Stack
        int[] arrInt = new int[5];
        for(int i = 0; i< 5;i++){
            arrInt[i] = Integer.parseInt(arrString[i]);
            queue.offer(arrInt[i]);
        }
        return queue;
    }
    public static void main(String[] args){
        //ввод значений карт первого игрока
        System.out.println("Введите значения карт игрока 1: ");
        Scanner in1= new Scanner(System.in);
        String str1 = in1.nextLine();
        //стек для первого игрока
        Queue<Integer> queueFirst = createQueue(str1);

        //ввод значений карт второго игрока
        System.out.println("Введите значения карт игрока 2: ");
        Scanner in2= new Scanner(System.in);
        String str2 = in2.nextLine();
        //стек для первого игрока
        Queue<Integer> queueSecond = createQueue(str2);


        System.out.println(game(queueFirst, queueSecond, 0));
    }
}
