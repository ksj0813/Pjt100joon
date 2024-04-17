package baekjoon.banbokmun;

import java.util.Scanner;

public class Main25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        int n = s.nextInt();
        int hap = 0;

        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            hap += a*b;
        }
        if (total == hap) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

