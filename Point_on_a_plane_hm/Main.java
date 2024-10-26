package org.example;

import org.example.homework_point_on_a_plane.Movable;
import org.example.homework_point_on_a_plane.Point;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(5);
        point1.setY(2);
        point1.moveUp(3);
        point1.moveDown(1);
        point1.moveLeft(2);
        point1.moveRight(4);
    }
}