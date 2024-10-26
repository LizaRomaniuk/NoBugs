package org.example;

import org.example.homework_student.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Hermione Granger");
        student1.setNumber(12345);
        student1.setGrade(100);
        student1.print();
    }
}
