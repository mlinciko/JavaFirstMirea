package ru.mirea.task12.opt2;

public abstract class SortingStudentsByGPA  implements Comparator{
    static int compare(int a, int b){
        if(a > b) return 1;
        else return 0;
    };
    //алгоритм быстрой сортировки
    static int partition(Student[] students, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (compare(students[i].getScore(),students[pivot].getScore()) == 1) {
                Student temp = students[counter];
                students[counter] = students[i];
                students[i] = temp;
                counter++;
            }
        }
        Student temp = students[pivot];
        students[pivot] = students[counter];
        students[counter] = temp;

        return counter;
    }

    public static void quickSort(Student[] students, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(students, begin, end);
        quickSort(students, begin, pivot-1);
        quickSort(students, pivot+1, end);
    }

    public static void main(String[] args){
        Student[] students = new Student[20];
        for(int i = 0; i < 20;i++){
            students[i] = new Student((int)(Math.random()*100+0));
        }
        for(int i = 0; i < 20;i++){
            System.out.println(students[i].getScore());
        }
        quickSort(students, 0, students.length-1);
        System.out.println("Sorted array: ");
        for(int i = 0; i < 20;i++){
            System.out.println(students[i].getScore());
        }
    }

}
