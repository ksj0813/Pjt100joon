package org.example.baekjoon1000.baekjoon;

import java.util.Scanner;

public class Main2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();

        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.print(1);
        } else {
            System.out.println(0);
        }

    }
}
