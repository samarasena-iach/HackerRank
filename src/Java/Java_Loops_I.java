package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
public class Java_Loops_I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
