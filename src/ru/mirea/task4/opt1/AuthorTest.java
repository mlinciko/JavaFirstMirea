package ru.mirea.task4.opt1;

public class AuthorTest {
    public static void main(String[] args) {
        Author author1 = new Author("Kristina Feklistova", "fekl@mail.ru", 'f');
        Author author2 = new Author("Belyaeva Ulyana", "ulyana@gmail.com", 'f');
        author2.setEmail("belyaeva@gmail.com");
        System.out.println(author1);
        System.out.println(author2);
    }
}
