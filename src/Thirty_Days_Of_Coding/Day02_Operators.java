package Thirty_Days_Of_Coding;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/30-operators/problem?isFullScreen=true
public class Day02_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double M = sc.nextDouble(); // original meal price
        double T = sc.nextDouble(); // tip percentage
        double X = sc.nextDouble(); // tax percentage
        sc.close();

        double tip = T / 100 * M;
        double tax = X / 100 * M;
        double total = M + tip + tax;
        int t = (int) Math.round(total);

        System.out.println("The total meal cost is " + t + " dollars.");
    }
}
