package ProblemSolving;

import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
public class Mini_Max_Sum {
    /**
     * Explanation
     * <p>
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
     * four of the five integers.
     * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
     * <p>
     * Example
     * arr = [1,3,5,7,9]
     * The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints: 16 24
     */

    public static void miniMaxSum(List<Integer> arr) {
        long sum = arr.get(0);

        int min = arr.get(0);
        int max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);

            if (arr.get(i) < min) {
                min = arr.get(i);
            }

            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        // Inputs
        // 01. a = {1, 2, 3, 4, 5}

        miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
    }
}
