package ru.mirea.task30;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        //создаем тестовые данные
        Author author1 = new Author("Ovcharenko Maria", "mlinciko@mail.ru",'f');

        String expectedName = author1.getName();
        String actualName = "Ovcharenko Maria";

        //запускаем тест
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    void getEmail() {
        //создаем тестовые данные
        Author author1 = new Author("Ovcharenko Maria", "mlinciko@mail.ru",'f');

        String expectedEmail = author1.getEmail();
        String actualEmail = "mlinciko@mail.ru";

        //запускаем тест
        Assert.assertEquals(expectedEmail, actualEmail);
    }

    @Test
    void getGender() {
        //создаем тестовые данные
        Author author1 = new Author("Ovcharenko Maria", "mlinciko@mail.ru",'f');

        char expectedGender = author1.getGender();
        char actualGender = 'f';

        //запускаем тест
        Assert.assertEquals(expectedGender, actualGender);
    }
}