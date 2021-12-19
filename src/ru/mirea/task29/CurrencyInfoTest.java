package ru.mirea.task29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CurrencyInfoTest {
    public static void main(String[] args) throws IOException {
        //создаем наш объект
        String[] territoryInfo = {"Площадь США - 9 834 000 км^2", "Площадь Канады 9 985 000 км^2", "Площадь Китая 9 597 000 км^2"};
        String[] resourcesInfo = {"В США добывается - уголь, нефть, газ", "В Индии добывается - уголь, руда", "В Китае добывается - нефть, уголь, руда"};

        CurrencyInfo info = new CurrencyInfo(territoryInfo, resourcesInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\mlinc\\Documents\\java.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(info);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();

        System.out.println(info.toString());
    }
}
