package ru.mirea.task13;

public class MyListTest {
    public static void main(String[] args){
        MyList list = new MyList();
        for(int i = 0; i < 11;i++){
            list.add(i);
        }
        for(int i = 0; i < 11; i++){
            System.out.print(list.get(i)+" ");
        }
        list.set(3,80);
        list.set(8,80);
        System.out.println("");
        System.out.println("NEW LIST");
        for(int i = 0; i < list.length(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        System.out.println("First index of 80: "+ list.indexOf(80));
        System.out.println("Last index of 80: "+list.lastIndexOf(80));

        list.remove(5);
        for(int i = 0; i < list.length(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        list.sort();
        System.out.println("SORTED LIST: ");
        for(int i = 0; i < list.length(); i++){
            System.out.print(list.get(i)+" ");
        }

        int[] newArray = list.subList(2,5);
        System.out.println("");
        System.out.println("ARRAY: ");
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

    }
}
