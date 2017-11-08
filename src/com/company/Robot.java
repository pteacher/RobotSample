package com.company;

/**
 * Created by TEACHER on 08.11.2017.
 */
public class Robot {
    private int x;
    private int y;
    private int health = 100;
    private final int CAPACITY = 5;
    private int loadUnits;
    private String name;

    public Robot() {
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
            default: move();
        }
    }

    public void move() {
        x += (int) (Math.random()*3-1); // -1..1
        y += (int) (Math.random()*3-1);
    }

    public void whereAmI() {
        System.out.println(x + " " + y);
    }
}
