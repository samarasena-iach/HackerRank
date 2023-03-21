package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
public class Java_Loops_II {
    public static void main(String[] argh) {
        int x = 0;

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            x = x + a;

            for (int j = 0; j < n; j++) {
                x = x + (int) (Math.pow(2, j)) * b;
                System.out.print(x + " ");
            }

            x = 0;
            System.out.println();
        }
        in.close();
    }
}
