package com.company;

/**
 * Created by TEACHER on 15.11.2017.
 */
public class BadRobot extends Robot {

    public BadRobot() {
        x = (int)(Math.random() * Field.size);
        y = (int)(Math.random() * Field.size);
        name = "Ugl-" + (int)(Math.random() * 10000);
        System.out.println("BadRobot " + name + " is ready to destroy at: " + x + ":" + y);
    }

    @Override
    public void move(char c) {
        switch (c) {
            case 'A': x--; break;
            case 'W': y--; break;
            case 'S': y++; break;
            case 'D': x++; break;
            case 'G': Field.putElement(y, x, 1); break;
            case 'M': Field.print(this); break;
            case 'U':
                if (Field.elements[y][x] == 2) {
                    Field.putElement(y, x, 0);
                } else {
                    System.err.println("NO HOLE HERE");
                }
                break;
            default: move();
        }

    }

    public void doRubbish() {
        Field.putElement(x, y, 1);
    }
}
