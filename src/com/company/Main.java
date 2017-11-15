package com.company;
import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        char[] botCommands = {'A', 'W', 'S', 'D', 'U', 'G'};
        Robot robot = new Robot(true);
        BadRobot badRobot = new BadRobot();

        Field.putRandomElements(5);
        char command;
        do {
            command = in.next().toUpperCase().charAt(0);
            robot.move(command);
            badRobot.move(botCommands[(int) (Math.random()*botCommands.length)]);
            robot.whereAmI();
            badRobot.whereAmI();
        } while (command != 'Q');
    }
}