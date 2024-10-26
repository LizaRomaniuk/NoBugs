package org.example;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Camry");
        car1.setYear(1982);

        car1.print();

        car1.start();
        car1.stop();
        car1.drive();
    }
}