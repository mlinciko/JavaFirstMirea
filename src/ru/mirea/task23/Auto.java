package ru.mirea.task23;

public class Auto {
    private int year = 0;
    private String mark = "";
    private String model ="";
    public Auto(int year, String mark, String model){
        this.year = year;
        this.mark = mark;
        this.model = model;
    }
    @Override
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args){
        Auto auto1 = new Auto(2013, "BMW", "X1");
        Auto auto2 = new Auto(2015, "Audi", "r8");
        Auto auto3 = new Auto(2013, "BMW", "X3");
        Auto auto4 = new Auto(2009, "Ford", "focus 2");
        Auto auto5 = new Auto(2013, "BMW", "X1");
        //сравнение объектов
        if(auto1.hashCode()==auto5.hashCode()) {
            System.out.println("Автомобиль " + auto1.mark + " " + auto1.model + " равен Автомобилю " + auto5.mark + " " + auto5.model);
        }
        else System.out.println("Автомобиль " + auto1.mark + " " + auto1.model + " НЕ равен Автомобилю " + auto5.mark + " " + auto5.model);
        System.out.println("Хеш-код Автомобиля " + auto1.mark + " " + auto1.model+  ": " + auto1.hashCode());
        System.out.println("Хеш-код Автомобиля " + auto5.mark + " " + auto5.model+  ": " + auto5.hashCode());
        System.out.println("");
        if(auto1.hashCode()==auto2.hashCode()) {
            System.out.println("Автомобиль " + auto1.mark + " " + auto1.model + " равен Автомобилю " + auto2.mark + " " + auto2.model);
        }
        else System.out.println("Автомобиль " + auto1.mark + " " + auto1.model + " НЕ равен Автомобилю " + auto2.mark + " " + auto2.model);
        System.out.println("Хеш-код Автомобиля " + auto1.mark + " " + auto1.model+  ": " + auto1.hashCode());
        System.out.println("Хеш-код Автомобиля " + auto2.mark + " " + auto2.model+  ": " + auto2.hashCode());
        System.out.println("");
        if(auto1.hashCode()==auto3.hashCode()) {
            System.out.println("Автомобиль " + auto1.mark + " " + auto1.model + " равен Автомобилю " + auto3.mark + " " + auto3.model);
        }
        else System.out.println("Автомобиль " + auto1.mark + " " + auto1.model + " НЕ равен Автомобилю " + auto3.mark + " " + auto3.model);
        System.out.println("Хеш-код Автомобиля " + auto1.mark + " " + auto1.model+  ": " + auto1.hashCode());
        System.out.println("Хеш-код Автомобиля " + auto3.mark + " " + auto3.model+  ": " + auto3.hashCode());
        System.out.println("");
        if(auto1.hashCode()==auto4.hashCode()) {
            System.out.println("Автомобиль " + auto1.mark + " " + auto1.model + " равен Автомобилю " + auto4.mark + " " + auto4.model);
        }
        else System.out.println("Автомобиль " + auto1.mark + " " + auto1.model + " НЕ равен Автомобилю " + auto4.mark + " " + auto4.model);
        System.out.println("Хеш-код Автомобиля " + auto1.mark + " " + auto1.model+  ": " + auto1.hashCode());
        System.out.println("Хеш-код Автомобиля " + auto5.mark + " " + auto4.model+  ": " + auto4.hashCode());


    }
}


