package ProblemSolving;

import java.util.Arrays;
import java.util.HashMap;

// Link: https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
public class Sales_By_Match {
    /**
     * Explanation
     * <p>
     * There is a large pile of socks that must be paired by color.
     * Given an array of integers representing the color of each sock,
     * determine how many pairs of socks with matching colors there are.
     * <p>
     * Example
     * n = 7
     * ar = [1,2,1,2,1,3,2]
     * There is one pair of color 1 and one of color 2.
     * There are three odd socks left, one of each color. The number of pairs is 2.
     */

    static int sockMerchant(int n, int[] ar) {
        int matchingPairs = 0;
        HashMap inventory = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int color = ar[i];

            if (inventory.containsKey(color) &&
                    inventory.get(color).equals(new Integer(1))) {
                inventory.put(color, 0);
                matchingPairs++;
                continue;
            }
            inventory.put(color, 1);
        }

        return matchingPairs;
    }

    public static void main(String[] args) {
        // Inputs
        // 01. n = 9, a = {10, 20, 20, 10, 10, 30, 50, 10, 20}

        System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }
}
