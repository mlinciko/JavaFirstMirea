package ru.mirea.task19;


class Services{
    private String choice;
    Services(String choice){
        this.choice = choice;
    }
    public String getChoice(){
        return this.choice;
    }
}

public class SuperSubCatch {
    public static void main(String[] args){
        Services services = null;
        try{
            services.getChoice();
        }
        catch (NullPointerException e){
            System.out.println("Вы не выбрали услугу");
        }
        catch (Exception e){
            System.out.println("Исключение общего вида");
        }
    }
}
