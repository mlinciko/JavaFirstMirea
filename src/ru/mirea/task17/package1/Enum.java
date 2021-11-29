package ru.mirea.task17.package1;

enum Services {
    Pediatrician, Therapist, Surgeon, Cardiologist, Ophthalmologist,Urologist,Dentist
}
public class Enum {
    public static void main(String[] args) {
        Services service;// объявляется переменная ар перечислимого типа Apple

        service = Services.Pediatrician; //  переменной ар присваивается значение RedDel

        // вывести значение перечислимого типа
        System.out.println("Значение service: " + service);
        System.out.println();

        service = Services.Therapist;

        // сравнить два значения перечислимого типа
        if (service == Services.Therapist) System.out.println("Переменная service содержит Therapist.\n");

        // применить перечисление для управления оператором switch
        switch (service) {
            case Pediatrician:
                System.out.println("Врач педиатр.");
                break;
            case Therapist:
                System.out.println("Врач терапевт.");
                break;
            case Surgeon:
                System.out.println("Врач хирург.");
                break;
            case Cardiologist:
                System.out.println("Врач кардиолог.");
                break;
            case Ophthalmologist:
                System.out.println("Врач офтальмолог.");
                break;
            case Urologist:
                System.out.println("Врач уролог.");
                break;
            case Dentist:
                System.out.println("Врач стоматолог");
                break;
        }
    }
}
