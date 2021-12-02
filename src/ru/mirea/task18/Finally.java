package ru.mirea.task18;
//класс для кнопки
class Button{
    boolean state;
    Button(boolean state){
        this.state = state;
    }
}

public class Finally {
    public static void press(Button button){
        if(button != null) {
            try {
                boolean state = button.state;
                throw new NullPointerException("Кнопка не инициализирована");
            } catch (NullPointerException e) {
                System.out.println("Нажмите на кнопку");
            }
            finally {
                System.out.println("Блок оператора finally");
            }
        }
    }

    public static void main(String[] args) {
        Button button1 = new Button(true);
        try {
            press(button1);
        } catch (Exception e) {
            System.out.println("Исключение перехвачено");
        }

    }
}