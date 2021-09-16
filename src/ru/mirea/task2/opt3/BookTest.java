package ru.mirea.task2.opt3;

public class BookTest {
    public static void main(String[] args){
        Book book1 = new Book("Pushkin", 1812);
        Book book2 = new Book();
        book2.setAuthor("Lermontov");
        book2.setYear(1839);
        System.out.println(book1);
        System.out.println(book2);
    }
}
