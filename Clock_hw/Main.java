package org.example;

public class Main {
    public static void main(String[] args) {
    Clock clock1 = new Clock ();
    clock1.setHour(14);
    clock1.setMinute(15);
    clock1.setSecond(18);

    clock1.readTime();

    clock1.tick();
    }
}