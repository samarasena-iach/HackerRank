package ProblemSolving;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/solve-me-first/problem?isFullScreen=true
public class Solve_Me_First {
    /**
     * Explanation
     * <p>
     * Complete the function solveMeFirst to compute the sum of two integers.
     * <p>
     * Example
     * a = 7, b = 3
     * return 10
     */

    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a + b;
    }

    public static void main(String[] args) {
        // Inputs
        // 01. a = 2, b = 3

        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
