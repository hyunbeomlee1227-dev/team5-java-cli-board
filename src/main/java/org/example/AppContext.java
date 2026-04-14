package org.example;

import java.util.Scanner;

public class AppContext {
    public static int attack;
    public static int defense;
    public static int gold;
    public static int HP;
    public static int MaxHP;
    public static Scanner scanner;

    public static void renew() {
        scanner = new Scanner(System.in);
        attack = 10;
        defense = 10;
        gold = 10;
        MaxHP = 100;
        HP = MaxHP;
    }

    public static void clearConsole() {
        for (int i = 0; i < 15; ++i) {
            System.out.println();
        }
    }
}
