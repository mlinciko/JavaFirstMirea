package ru.mirea.task18;


public class MultipleCatches {
    public static void main (String[] args){
        int[] arr = {5, 3, 5, 7, 8};
        int[] arr1 = null;
        try{
            for(int i = 0; i < 6; i++){
                arr[i] += 1;
            }
            System.out.println(arr1[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка индексации");
        }catch(NullPointerException e){
            System.out.println("Отсутсвует массив");
        }
    }
}
