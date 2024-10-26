package org.example.homework_book;

public class Book implements Displayable {
    private String name;
    private String author;
    private int year;

    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    @Override
    public void display() {
        System.out.println("Book name " + this.name);
        System.out.println("Author " + this.author);
        System.out.println("Year of edition " + this.year);
    }
}
