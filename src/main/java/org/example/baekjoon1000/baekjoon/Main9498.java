package org.example.baekjoon1000.baekjoon;

import java.util.Scanner;

public class Main9498 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num;

        num = s.nextInt();

        if(90 <= num)
            System.out.println("A");
        else
            if(num>=80)
                System.out.println("B");
        else
            if(70 <= num)
                System.out.println("C");
        else
            if(60 <= num)
                System.out.println("D");
        else
            if(num < 70)
                System.out.println("F");

        }

    }

