package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class WeekdaysWithSwitch {
    public static void main(String[] args) {
        // 1...7 read number from console
        // 1 means monday
        // 7 means sunday
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Hey, provide the ordinal number of weekday: ");
        int ordinalNumberOfWeekday = inputReader.nextInt();

        switch (ordinalNumberOfWeekday) {
            case 1:
                System.out.println("It`s monday");
                break;// if we don`t write break after every case, then it will continue to run and print out all the sout
            case 2:
                System.out.println("It`s tuesday");
                break;
            case 3:
                System.out.println("It`s wednesday");
                break;
            case 4:
                System.out.println("It`s thursday");
                break;
            case 5:
                System.out.println("It`s friday");
                break;
            case 6:
                System.out.println("It`s saturday");
            break;
            case 7:
                System.out.println("It`s sunday");
            break;
            default:
                System.out.println("Don`t cheat!");
        }
    }
}
