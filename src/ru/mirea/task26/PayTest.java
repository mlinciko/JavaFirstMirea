package ru.mirea.task26;

import java.util.Scanner;

public class PayTest {
    public static void main(String[] args){
        System.out.println("Выберите способ оплаты: 1 - Электронный кошелек; 2 - Кредитная карта");
        Scanner in = new Scanner(System.in);
        int order = in.nextInt();

        PayStrategy strategy;
        switch(order){
            case 1:
                strategy = new PayByEWallet();
                break;
            case 2:
                strategy = new PayByCreditCard();
                break;
            default:
                throw new IllegalStateException("Неверное значение: " + order);
        }
        strategy.collectPaymentDetails();
        strategy.doPayment();
    }
}
