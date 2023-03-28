package ProblemSolving;

import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true
public class Divisible_Sum_Pairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> elements) {
        int noOfDivisiblePairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int elementOne = elements.get(i);
                int elementTwo = elements.get(j);
                int sum = elementOne + elementTwo;
                int mod = sum % k;

                System.out.println("i = " + elementOne + " || j = " + elementTwo + " || k = " + k);
                System.out.println("i + j = " + sum);
                System.out.println("(i + j) % k = " + mod);
                if (mod == 0) {
                    System.out.println("Divisible Pair Found : elements[" + i + "] & elements[" + j + "]");
                    noOfDivisiblePairs++;
                }

                System.out.println();
            }
        }
        return noOfDivisiblePairs;
    }

    public static void main(String[] args) {
        System.out.println("Total Divisible Pairs = " + divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
    }
}
