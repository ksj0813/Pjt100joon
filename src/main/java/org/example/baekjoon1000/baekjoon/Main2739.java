package org.example.baekjoon1000.baekjoon;

import java.util.Scanner;
public class Main2739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.close();

        for (int i = 1; i <= 9; i++) {
                System.out.println(n + " * " + i + " = " + (n*i));
            }
        }
    }

