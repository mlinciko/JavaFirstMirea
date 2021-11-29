package ru.mirea.task17.package2;

// Использовать конструктор, переменную экземпляра и метод в перечислении
enum Services {
    // количество врачей каждой специализации
    Pediatrician(4), Therapist(3), Surgeon(1),
    Cardiologist(1), Ophthalmologist(2),Urologist(1),Dentist(3);

    // Переменная экземпляра price, служит для хранения цены
    private int amount;

    // Конструктор Services(), ему передается количество
    // (аргументы конструктору передаются в скобках после каждой перечисляемой константы)
    Services(int amount) {
        this.amount = amount;
    }

    // Метод getPrice(), возвращающий значение цены
    int getAmount() {
        return amount;
    }
}
public class Enum3 {
    public static void main(String[] args) {
        // У каждой константы перечислимого типа имеется своя копия переменной экземпляра amount,
        // поэтому для получения цены на определенный сорт яблок достаточно вызвать метод getPrice()
        System.out.println("Врачей " + Services.valueOf("Pediatrician") + " в МедЦентре " + Services.valueOf("Pediatrician").getAmount());

        // вывести цены на все сорта яблок
        System.out.println("\nКоличество врачей в МедЦентре:");
        for (Services a : Services.values()) {
            System.out.println(a + " - количество - " + a.getAmount());
        }
    }
}
