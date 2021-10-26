package ru.mirea.task13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        //тестирование метода добавления элемента
        for (int i = 0; i < 10; i++) {
            list.add(i,(int) (Math.random() * 20 + 0));
        }
        //тестирование метода получения элемента
        System.out.println("List");
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        //тестирование медота, добавляющего элемент в начало списка
        list.addFirst(60);
        //тестирование медота, добавляющего элемент в конец списка
        list.addLast(50);
        System.out.println("List");
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        //тестирование метода, возвращающего первый элемент списка
        System.out.println("First element: "+list.peekFirst());
        //тестирование метода, возвращающего последний элемент списка
        System.out.println("Last element: "+list.peekLast());
        System.out.println("");
        //тестирование метода, возвращающих первый/последний элементы и удаляющий их
        list.pollFirst();
        list.pollLast();
        System.out.println("List");
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
