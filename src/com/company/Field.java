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
    public static void print() {
        for (int[] row : elements) {
            for (int el: row) {
                System.out.printf("%2d", el);
            }
            System.out.println();
        }
    }
}
