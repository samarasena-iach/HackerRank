package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
public class Java_StdIn_StdOut_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            System.out.println(a);
        }
    }
}
