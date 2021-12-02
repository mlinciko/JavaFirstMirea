package ru.mirea.task19;

class Button{
    boolean state;
    Button(boolean state){
        this.state = state;
    }
}
public class ReturnCatchFinally {
    public static String press(Button button){
        try{
            boolean state = button.state;
            throw new NullPointerException("Кнопка не инициализирована");
        }catch (NullPointerException e){
            String message = "Кнопка не инициализирована";
            return message;
        }finally {
            String message;
            return message = "Нажмите на кнопку";
        }
    }
    public static void main(String[] args){
        Button button = new Button(true);
        System.out.println(press(button));
    }

}
