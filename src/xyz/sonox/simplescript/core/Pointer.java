package xyz.sonox.simplescript.core;

public class Pointer {

    private int x;
    private int y;

    public Pointer() {
        x = 0;
        y = 0;
    }

    public Pointer(int xPosition, int yPosition) {
        x = xPosition;
        y = yPosition;
    }

    public void moveX(int distance) {
        x += distance;
    }

    public void moveY(int distance) {
        y += distance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void resetPointer() {
        x = 0;
        y = 0;
    }

}
