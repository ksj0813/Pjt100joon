package org.example.baekjoon1000.baekjoon;

import java.util.Scanner;

public class Main1330 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a ,b ;

        a = s.nextInt();
        b = s.nextInt();

        if(a>b) System.out.println(">");
        if(a<b) System.out.println("<");
        if(a==b) System.out.println("==");


    }
}
