package com.company;

/**
 * Created by TEACHER on 08.11.2017.
 */
public class Robot {
    protected int x;
    protected int y;
    protected int health = 100;
    protected final int CAPACITY = 5;
    protected int loadUnits; // 0
    protected String name;

    public Robot() {

    }

    public Robot(boolean b) {
        x = (int)(Math.random() * Field.size);
        y = (int)(Math.random() * Field.size);
        name = "Wall-" + (int)(Math.random() * 10000);
        System.out.println("Robot " + name + " is ready for work at: " + x + ":" + y);
    }

    public Robot(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        System.out.println("Robot " + name + " is ready for work at: " + x + ":" + y);

    }

    public void move(char c) {
        switch (c) {
            case 'A': x--; break;
            case 'W': y--; break;
            case 'S': y++; break;
            case 'D': x++; break;
            case 'M': Field.print(this); break;
            case 'F':
                if (Field.elements[y][x] == 0) {
                    Field.putElement(y, x, 2);
                } else {
                    System.err.println("I CANT DRILL HERE");
                }
                break;
            default: move();
        }
        if (loadUnits < CAPACITY && Field.elements[y][x] == 1) {
            loadUnits++;
            Field.putElement(y, x, 0);
        }
    }

    public void move() {
        x += (int) (Math.random()*3-1); // -1..1
        y += (int) (Math.random()*3-1);
    }

    public void whereAmI() {
        System.out.println(x + " " + y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
