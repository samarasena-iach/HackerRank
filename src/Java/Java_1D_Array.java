package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-1d-array-introduction/problem?isFullScreen=true
public class Java_1D_Array {
    public static void main(String[] args) {
        // Inputs
        // 01. n = 5, a = {10,20,30,40,50}

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
