package ProblemSolving;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
public class Diagonal_Difference {
    /**
     * Explanation
     * <p>
     * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
     * For example, the square matrix 'arr' is shown below:
     * 1 2 3
     * 4 5 6
     * 9 8 9
     * <p>
     * The left to right diagonal = 1 + 5 + 9 = 15
     * The right to left diagonal = 3 + 5 + 9 = 17
     * Their absolute difference is 15 - 17 = 2
     */

    public static void main(String[] args) {
        // Inputs
        // 01. n = 3, a = {[11 2 4], [4 5 6], [10 8 -12]}
        // The primary diagonal is: 11, 5, -12
        // The secondary diagonal is: 4, 5, 10

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sumLeft = 0;
        int sumRight = 0;
        int diagonalDifference = 0;
        int arr[] = new int[n * n];

        if (n == 1) {
            System.out.println(in.nextInt());
        } else {
            for (int i = 0; i < n * n; i++) {
                arr[i] = in.nextInt();
            }

            for (int i = 0, j = n - 1; i < arr.length; ) {
                sumLeft += arr[i];
                sumRight += arr[j];

                i += n + 1;
                j += n - 1;
            }

            diagonalDifference = (sumLeft - sumRight);

            if (diagonalDifference < 0)
                diagonalDifference = -1 * (sumLeft - sumRight);

            System.out.println(diagonalDifference);
        }
    }
}
