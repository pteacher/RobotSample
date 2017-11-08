package com.company;
import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Robot robot = new Robot();
        char command;
        do {
            command = in.next().toUpperCase().charAt(0);
            robot.move(command);
            robot.whereAmI();
        } while (command != 'Q');
    }
}