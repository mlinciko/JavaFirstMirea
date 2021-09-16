package ru.mirea.task3.opt3;

public class Book {
    private String author;
    private String name;
    private int year;
    public Book(){
        author="unknown";
        name = "unknown";
        year = 0;
    }
    public Book(String author, String name, int year){
        this.author=author;
        this.name = name;
        this.year = year;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return "Author: "+this.author+", Name of a book: "+ this.name +", Year: "+this.year;
    }
}
