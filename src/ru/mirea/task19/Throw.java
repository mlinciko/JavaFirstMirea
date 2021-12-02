package ru.mirea.task19;


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

public class Throw {
    public static void main(String[] args){
        Date date = null;
        try{
            System.out.println("Вы выбрали дату: " + date.getDate());
            throw new NullPointerException("поле date неинициализировано");
        }catch(NullPointerException e){
            System.out.println("Вы не выбрали дату");
        }
    }
}
