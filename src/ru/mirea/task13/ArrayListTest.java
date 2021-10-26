package ru.mirea.task13;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //тестирование метода добавления элемента
        for (int i = 0; i < 10; i++) {
            list.add(i,(int) (Math.random() * 20 + 0));
        }
        //тестирование метода получения элемента
        System.out.println("List");
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        //тестирования метода замены элемента на новый
        list.set(0,100);
        list.set(9,100);
        //тестирование метода, возвращающего индекс элемента
        System.out.println("First index of 100: "+list.indexOf(100));
        //тестирование метода, который возвращает индекс последнего вхождения элемента в список
        System.out.println("Last index of 100: "+list.lastIndexOf(100));
        //тестирование удаления элемента списка
        list.remove(0);
        System.out.println("Remove");
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        //тестирование сортировки списка
        Collections.sort(list);
        System.out.println("Sorted List");
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
