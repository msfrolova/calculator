package com.company.calculator;

import java.util.Scanner;

public class Reader {
    static Scanner sc = new Scanner(System.in);

    public static String read() {
        return sc.nextLine();
    }

    public static void close() {
        sc.close();
    }
}
