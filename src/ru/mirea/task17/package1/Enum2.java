package ru.mirea.task17.package1;

enum Services1 {
    Pediatrician, Therapist, Surgeon, Cardiologist, Ophthalmologist,Urologist,Dentist
}
public class Enum2 {
    public static void main(String[] args) {
        Services1 service;
        System.out.println("Константы перечислимого типа Services1:");

        // создается переменная allServices, которой присваивается ссылка на массив значений перечислимого типа.
        Services1 allServices[] = Services1.values();
        for (Services1 a : allServices) {
            System.out.println(a);
        }

        System.out.println("\nКонстанты перечислимого типа Services1:");

        // цикл for можно написать и без переменной allServices
        for (Services1 a : Services1.values() ) {
            System.out.print(a + " ");
        }

        System.out.println("\n");

        // метод valueOf() возвращает значение перечислимого типа, связанное с именем константы того же типа,
        // передаваемым этому методу в виде символьной строки.
        service = Services1.valueOf("Surgeon");
        System.out.println("Пepeмeннaя service содержит " + service);
    }
}
