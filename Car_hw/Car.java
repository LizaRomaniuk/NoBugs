package org.example;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;
    private boolean isRunning;

    public void setBrand (String brand) {
        this.brand = brand;
    }
    public void setModel (String model) {
        this.model = model;
    }
    public void setYear (int year) {
        this.year = year;
    }

    public String getBrand () {
        return this.brand;
    }
    public String getModel () {
        return this.model;
    }
    public int getYear () {
        return this.year;
    }

    public void print () {
        System.out.println("Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year);

    }


    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The car has started.");
        }
        else {
            System.out.println("The car is already running.");
        }
    }

    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The car has stopped.");
        }
        else {
            System.out.println("The car is already stopped.");
        }
    }

    @Override
    public void drive() {
        if (isRunning) {
            System.out.println("The car is driving.");
        }
        else {
            System.out.println("Start the car first.");
        }
    }
}
