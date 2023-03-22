package ProblemSolving;

import java.util.Arrays;

// Link: https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
public class Staircase {
    /**
     * Explanation
     * <p>
     * This is a staircase of size n = 4:
     *    #
     *   ##
     *  ###
     * ####
     *
     * Its base and height are both equal to n.
     * It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
     */

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Inputs
        // 01. n = 6

        staircase(6);
    }
}
