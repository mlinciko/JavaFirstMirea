package ru.mirea.task18;
class Services{
    private String choice;
    Services(String choice){
        this.choice = choice;
    }
    public String getChoice(){
        return this.choice;
    }
}
public class HandleError {
    public static void main(String[] args){
        Services services = null;
        try{
            services.getChoice();
        }
        catch (NullPointerException e){
            System.out.println("Вы не выбрали услугу");
            services = new Services("Pediatrician");
        }
        System.out.println("Исключение обработано");
        System.out.println("Услуга по умолчанию: "+services.getChoice());
    }
}
