package ru.mirea.task28;

public class Auto {

    private String model;
    private String brand;

    public Auto(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public void start() {
        System.out.println("Поехали!");
    }
    //вложенный класс, отвечающий за управление
    public class HandleBar {

        public void right() {
            System.out.println("Повернуть вправо!");
        }

        public void left() {
            System.out.println("Повернуть влево!");
        }
    }
    //вложенный класс, отвечающий за остаток бензина
    public static class Petrol {

        private int amount;

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return this.amount;
        }
    }
}

//интерфйес для анонимного класса
interface MonitoringSystem {
    public void startMonitoring();
}




