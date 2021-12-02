package ru.mirea.task19;


import java.util.ArrayList;

class Record{
    private ArrayList<String> times = new ArrayList<>();
    private String doctor;
    Record(String time){
        times.add(time);
    }
    public String getTime(int index){
        return times.get(index);
    }
    public String getDoctor(){
        return doctor;
    }
}
public class NestedTry {
    public static void main (String[] args){
        Record record = new Record("15:30");
        try{
            String time = record.getTime(0);
            try{
                String doctor = record.getDoctor();
                throw new NullPointerException("поле Doctor неинициализировано");
            }catch(NullPointerException e){
                System.out.println("Нет доступного врача");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Нет доступного времени");
        }
    }
}
