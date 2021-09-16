package ru.mirea.task2.opt3;

public class Book {
    private String author;
    private int year;
    public Book(){
        author="unknown";
        year = 0;
    }
    public Book(String author, int year){
        this.author=author;
        this.year = year;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return "Author: "+this.author+", Year: "+this.year;
    }
}
