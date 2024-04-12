package org.example.baekjoon1000.baekjoon;

import java.util.Scanner;

public class Main10430 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
