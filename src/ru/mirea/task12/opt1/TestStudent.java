package ru.mirea.task12.opt1;

public class TestStudent {
    public static void main(String[] args){
        Student[] students = new Student[20];
        for(int i = 0; i < 20;i++){
            students[i] = new Student((int)(Math.random()*100+0));
        }
        for(int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while(j >= 0 && current.getIDNumber() < students[j].getIDNumber()) {
                students[j+1] = students[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= students[j]
            students[j+1] = current;
        }
        for(int i = 0; i < 20;i++){
            System.out.println(students[i].getIDNumber());
        }
    }
}
