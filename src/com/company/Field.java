package com.company;

public class Field {
    public static final int size = 10;
    public static int[][] elements = new int[size][size];

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
