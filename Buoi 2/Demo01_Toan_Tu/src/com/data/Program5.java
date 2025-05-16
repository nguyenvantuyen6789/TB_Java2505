package com.data;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // level 1 -> 5
        int level = 2;
        switch (level) {
            case 1:
                System.out.println("Level thấp");
                break;
            case 2:
                System.out.println("Level gà");
                break;
            case 3:
                System.out.println("Level ổn");
                break;
            case 4:
                System.out.println("Level pro");
                break;
            default:
                System.out.println("Level Master");
        }
    }
}
