package org.example.homework_student;

public class Student implements Printable {
    private String name;
    private int number;
    private int grade;

    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }
    public int getNumber() {
        return this.number;
    }
    public int getGrade() {
        return this.grade;
    }


    @Override
    public void print() {
        System.out.println("Student name " + name);
        System.out.println("Gradebook number " + number);
        System.out.println("Average grade " + grade);
    }
}
