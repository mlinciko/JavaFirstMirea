package ru.mirea.task12.opt3;

import java.util.ArrayList;

public class MergeTest {
    //сортировка слиянием
    static void merge(ArrayList<Student> students1, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        ArrayList<Student> leftArray = new ArrayList<Student>();
        ArrayList<Student> rightArray = new ArrayList<Student>();

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray.add(i,students1.get(left+i));
        for (int i = 0; i < lengthRight; i++)
            rightArray.add(i,students1.get(mid+i+1));

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray.get(leftIndex).getScore() < rightArray.get(rightIndex).getScore()) {
                    students1.set(i,leftArray.get(leftIndex));
                    leftIndex++;
                }
                else {
                    students1.set(i,rightArray.get(rightIndex));
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                students1.set(i,leftArray.get(leftIndex));
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                students1.set(i, rightArray.get(rightIndex));
                rightIndex++;
            }
        }
    }

    public static void mergeSort(ArrayList<Student> students1, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(students1, left, mid);
        mergeSort(students1, mid+1, right);
        merge(students1, left, mid, right);
    }

    public static void main(String[] args) {
        //первый список студентов
        ArrayList<Student> students1 = new ArrayList<Student>();
        //добавляем элементы в список students1
        for (int i = 0; i < 20; i++) {
            students1.add(i, new Student((int) (Math.random() * 100 + 0)));
        }
        //второй список студентов
        ArrayList<Student> students2 = new ArrayList<Student>();
        //добавляем элементы в список students2
        for (int i = 0; i < 20; i++) {
            students2.add(i, new Student((int) (Math.random() * 100 + 0)));
        }
        //добавляем один список к другому
        students1.addAll(students2);
        System.out.println("LIST");
        for(int i = 0; i < students1.size();i++){
            System.out.println(students1.get(i).getScore());
        }
        mergeSort(students1, 0, students1.size()-1);
        System.out.println("SORTED LIST");
        for(int i = 0; i < students1.size();i++){
            System.out.println(students1.get(i).getScore());
        }
    }
}
