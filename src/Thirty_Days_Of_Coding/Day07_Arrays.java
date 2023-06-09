package Thirty_Days_Of_Coding;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/30-arrays/problem?isFullScreen=true
public class Day07_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
