package ru.mirea.task17.examples.package01;

enum Apple1 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
// В программе демонстрируется применение методов values() и valueOf()
class EnumDemo2 {
    public static void main(String[] args) {
        Apple1 ap;
        System.out.println("Константы перечислимого типа Apple:");

        // создается переменная allapples, которой присваивается ссылка на массив значений перечислимого типа.
        Apple1 allapples[] = Apple1.values();
        for (Apple1 a : allapples) {
            System.out.println(a);
        }

        System.out.println("\nКонстанты перечислимого типа Apple:");

        // цикл for можно написать и без переменной allapples
        for (Apple1 a : Apple1.values() ) {
            System.out.print(a + " ");
        }

        System.out.println("\n");

        // метод valueOf() возвращает значение перечислимого типа, связанное с именем константы того же типа,
        // передаваемым этому методу в виде символьной строки.
        ap = Apple1.valueOf("Winesap");
        System.out.println("Пepeмeннaя ар содержит " + ap);
    }
}
/* ----------------------------------------
Константы перечислимого типа Apple:
Jonathan
GoldenDel
RedDel
Winesap
Cortland

Константы перечислимого типа Apple:
Jonathan GoldenDel RedDel Winesap Cortland

Пepeмeннaя ар содержит Winesap
 */