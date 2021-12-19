package ru.mirea.task26;
import java.util.Scanner;

public interface PayStrategy {
    void collectPaymentDetails();
    void doPayment();
}

class PayByEWallet implements PayStrategy {
    private String email;
    private String password;


    @Override
    public void collectPaymentDetails() {
        System.out.print("Введите ваш email: ");
        Scanner in1 = new Scanner(System.in);
        email = in1.nextLine();
        System.out.print("Введите пароль: ");
        Scanner in2 = new Scanner(System.in);
        password = in2.nextLine();
    }
    @Override
    public void doPayment(){
        System.out.println("Оплата прошла!");
    }
}

class PayByCreditCard implements PayStrategy {
    private String number;
    private String date;
    private String cvv;

    @Override
    public void collectPaymentDetails() {
        System.out.print("Введите номер карты: ");
        Scanner in3 = new Scanner(System.in);
        number = in3.nextLine();
        System.out.print("Введите дату окончания действия 'mm/yy': ");
        Scanner in4 = new Scanner(System.in);
        date = in4.nextLine();
        System.out.print("Введите код CVV: ");
        Scanner in5 = new Scanner(System.in);
        cvv = in5.nextLine();
    }
    @Override
    public void doPayment(){
        System.out.println("Оплата прошла!");
    }
}

