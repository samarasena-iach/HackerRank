package ProblemSolving;

import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
public class Plus_Minus {
    /**
     * Explanation
     * <p>
     * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
     * Print the decimal value of each fraction on a new line with 6 places after the decimal.
     * <p>
     * Example
     * arr = [1,1,0,-1,-1]
     * There are n=5 elements, two positive, two negative and one zero.
     * Their ratios are 2/5 = 0.400000, 2/5 = 0.400000 and 1/5 = 0.200000
     * Results are printed as: 0.400000, 0.400000, 0.200000
     */

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) {
                countZeros += 1;
            } else if (arr.get(i) > 0) {
                countPositive += 1;
            } else if (arr.get(i) < 0) {
                countNegative += 1;
            }
        }

        System.out.println(String.format("%.6f", countPositive * 1.0 / n));
        System.out.println(String.format("%.6f", countNegative * 1.0 / n));
        System.out.println(String.format("%.6f", countZeros * 1.0 / n));
    }

    public static void main(String[] args) {
        // Inputs
        // 01. n = 6, a = {-4, 3, -9, 0, 4, 1}

        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }
}
