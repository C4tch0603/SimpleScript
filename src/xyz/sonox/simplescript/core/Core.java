package xyz.sonox.simplescript.core;

import java.util.Arrays;

public class Core {

    private final int[][] storage;

    public Core(int xSize, int ySize) {
        storage = new int[xSize][ySize];
        Arrays.fill(storage, 0);
    }

    public void setValue(Pointer position, int newValue) {
        checkBounds(position);
        storage[position.getX()][position.getY()] = newValue;
    }

    public int getValue(Pointer position) {
        checkBounds(position);
        return storage[position.getX()][position.getY()];
    }

    public void increaseValue(Pointer position, int value) {
        checkBounds(position);
        storage[position.getX()][position.getY()] += value;
    }

    public void decreaseValue(Pointer position, int value) {
        increaseValue(position, -value);
    }

    private void checkBounds(Pointer position) {
        if (storage.length >= position.getX() || position.getX() < 0)
            throw new IndexOutOfBoundsException("X position of pointer out of storage bounds!");

        if (storage[0].length >= position.getY() || position.getY() < 0)
            throw new IndexOutOfBoundsException("Y position of pointer out of storage bounds!");
    }

}
