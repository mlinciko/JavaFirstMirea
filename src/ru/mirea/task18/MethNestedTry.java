package ru.mirea.task18;

class Date{
    private String date;
    Date(String date){
        this.date = date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
}

public class MethNestedTry {
    public static void checkDate(Date date){
        try {
            System.out.println("Вы выбрали дату: " + date.getDate());
        }catch (NullPointerException e){
            System.out.println("Исключение");
        }
    }
    public static void main(String[] args){
        Date date = null;
        try{
            checkDate(date);
        }catch(NullPointerException e){
            System.out.println("Вы не выбрали дату");
        }
    }
}
