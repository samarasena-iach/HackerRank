package ProblemSolving;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
public class Simple_Array_Sum {
    /**
     * Explanation
     * <p>
     * Given an array of integers, find the sum of its elements.
     * For example, if the array ar = [1,2,3], 1+2+3=6, so return 6
     */

    public static void main(String[] args) {
        // Inputs
        // 01. n = 6, a = {1,2,3,4,10,11}

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            sum = sum + arr[arr_i];
        }
        System.out.println(sum);
    }
}
