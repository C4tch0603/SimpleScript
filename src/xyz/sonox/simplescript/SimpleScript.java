package xyz.sonox.simplescript;

import org.jetbrains.annotations.NotNull;
import xyz.sonox.simplescript.core.Core;
import xyz.sonox.simplescript.core.Pointer;

public class SimpleScript {

    private Core core;
    private Pointer pointer;

    private boolean xPointer;

    public SimpleScript() {
        core = new Core(10, 10);
        pointer = new Pointer();
        xPointer = true;
    }

    public SimpleScript(int sizeX, int sizeY) {
        core = new Core(sizeX, sizeY);
        pointer = new Pointer();
        xPointer = true;
    }

    public void execute(@NotNull String command) {
        char[] cmd_chars = command.toLowerCase().toCharArray();
        for (char c : cmd_chars) {
            switch (c) {
                case 'x':
                    xPointer = true;
                    break;
                case 'y':
                    xPointer = false;
                    break;
                case '>':
                    if (xPointer) pointer.moveX(1);
                    else pointer.moveY(1);
                    break;
                case '<':
                    if (xPointer) pointer.moveX(-1);
                    else pointer.moveY(-1);
                    break;
                case '+':
                    core.increaseValue(pointer, 1);
                    break;
                case '-':
                    core.decreaseValue(pointer, 1);
                    break;
                case '$':
                    System.out.print(core.getValue(pointer));
                    break;
                case '&':
                    System.out.print((char) core.getValue(pointer));
                    break;
            }
        }
    }

}
