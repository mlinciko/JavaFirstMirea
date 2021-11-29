package ru.mirea.task17.package3;

enum Services {
    Pediatrician, Therapist, Surgeon, Cardiologist, Ophthalmologist,Urologist,Dentist
}
public class Enum4 {
    public static void main(String[] args) {
        Services serv1, serv2, serv3;

        System.out.println("Получить все константы и порядковые значения:");

        for(Services a: Services.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        serv1 = Services.Surgeon;
        serv2 = Services.Pediatrician;
        serv3 = Services.Surgeon;

        System.out.println("\nПродемонстрировать применение метода compareTo():");
        if (serv1.compareTo(serv2) < 0) System.out.println(serv1 + " предшествует " + serv2);
        if (serv1.compareTo(serv2) > 0) System.out.println(serv2 + " предшествует " + serv1);
        if (serv1.compareTo(serv3) == 0) System.out.println(serv1 + " равно " + serv3);

        System.out.println("\nПродемонстрировать применение метода equals():");
        if (serv1.equals(serv2)) System.out.println("Ошибка!");
        if (serv1.equals(serv3)) System.out.println(serv1 + " равно " + serv3);

        System.out.println("\nСравнить на равенство:");
        if (serv1 == serv3) System.out.println(serv1 + " == " + serv3);
    }
}
