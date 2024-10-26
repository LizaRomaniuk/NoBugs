package org.example;

import org.example.homework_book.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("Harry Potter");
        book1.setAuthor("Joanne Rowling");
        book1.setYear(1997);
        book1.display();
    }
}
