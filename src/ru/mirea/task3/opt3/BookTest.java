package ru.mirea.task3.opt3;

public class BookTest {
    public static void main(String[] args){
        Book book1 = new Book("Pushkin","Evgeniy Onegin", 1833);
        Book book2 = new Book();
        book2.setAuthor("Lermontov");
        book2.setName("Mtsyri");
        book2.setYear(1840);
        System.out.println(book1);
        System.out.println(book2);
    }
}
