package com.company;

import java.util.Random;

public class Field {
    public static final int size = 10;
    public static int[][] elements = new int[size][size];

    public static void putRandomElements(int count) {
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            elements[r.nextInt(size)][r.nextInt(size)] = 1;
        }
    }
    public static void putElement(int x, int y, int type) {
        elements[x][y] = type;
    }
    public static void print(Robot r) {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                if (r.getX() == x && r.getY() == y) {
                    System.out.printf("%2s", "R");
                }
                else
                    System.out.printf("%2d", elements[y][x]);
            }
            System.out.println();
        }
    }
}
