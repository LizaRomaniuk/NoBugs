package org.example.homework_point_on_a_plane;

public class Point implements Movable {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }


    @Override
    public void moveUp(int distance) {
        this.y = this.y + distance;
        System.out.println("Moved up " + this.y);
    }

    @Override
    public void moveDown(int distance) {
        this.y = this.y - distance;
        System.out.println("Moved down " + this.y);
    }

    @Override
    public void moveLeft(int distance) {
       this.x = this.x - distance;
       System.out.println("Moved left " + this.x);
    }

    @Override
    public void moveRight(int distance) {
        this.x = this.x + distance;
        System.out.println("Moved right " + this.x);
    }
}
