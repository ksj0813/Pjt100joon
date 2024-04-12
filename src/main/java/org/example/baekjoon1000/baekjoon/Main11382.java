package org.example.baekjoon1000.baekjoon;

import java.util.Scanner;
public class Main11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Scanner(클래스) s(이름) = new(생성자) Scanner(System(클래스).in(함수/메서드))
        long a,b,c;

        a = s.nextLong();
        b = s.nextLong();
        c = s.nextLong();

        System.out.println(a+b+c);
    }
}
