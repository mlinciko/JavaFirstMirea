package ru.mirea.task28;

public class AutoTest {
    public static void main(String[] args){
        //анонимный класс
        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };

        Auto auto = new Auto("focus 2", "ford");
        securityModule.startMonitoring();
        auto.start();

        Auto.Petrol stateOfPetrol = new Auto.Petrol();
        stateOfPetrol.setAmount(20);
        stateOfPetrol.getAmount();
    }
}
