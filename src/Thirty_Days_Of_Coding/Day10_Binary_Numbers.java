package Thirty_Days_Of_Coding;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/30-binary-numbers/problem?isFullScreen=true
public class Day10_Binary_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int r = n, counter = 0, consecutiveOnes = 0;
        String s = "";

        while (n > 0) {
            r = n % 2;

            if (r == 1) {
                counter++;
                if (counter > consecutiveOnes) {
                    consecutiveOnes = counter;
                }
            } else {
                counter = 0;
            }

            s = r + s;
            n = n / 2;
        }

        System.out.println(consecutiveOnes);
    }
}
