package ru.mirea.task15;
import java.io.*;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        //создаем новый файл
        File file = new File("C://users/mlinc/Projects/test.txt");
        try {
            boolean created = file.createNewFile();
            if (created)
                System.out.println("Файл создан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //запись в файл
        System.out.println("Введите строку");
        Scanner in1 = new Scanner(System.in);
        String str1 = in1.nextLine();
        try(FileWriter writer = new FileWriter("C://users/mlinc/Projects/test.txt", false))
        {
            //запись всей строки в файл
            writer.write(str1);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        //чтение из файла
        try(FileReader reader = new FileReader("C://users/mlinc/Projects/test.txt"))
        {
            // читаем посимвольно
            int c;
            System.out.println("Запись из файла: ");
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        //дозапись в конец файла
        System.out.println("");
        System.out.println("Введите строку");
        Scanner in2 = new Scanner(System.in);
        String str2 = in2.nextLine();
        try(FileWriter writer = new FileWriter("C://users/mlinc/Projects/test.txt", true))
        {
            //запись всей строки в файл
            writer.write(str2);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
