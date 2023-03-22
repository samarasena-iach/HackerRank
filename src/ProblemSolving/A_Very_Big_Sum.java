package ProblemSolving;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true
public class A_Very_Big_Sum {
    /**
     * Explanation
     * <p>
     * In this challenge, you are required to calculate and print the sum of the elements in an array,
     * keeping in mind that some of those integers may be quite large.
     */

    public static void main(String[] args) {
        // Inputs
        // 01. n = 5, a = {1000000001,1000000002,1000000003,1000000004,1000000005}

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        long tot = 0L;
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            tot = tot + arr[arr_i];
        }
        System.out.println(tot);
    }
}
