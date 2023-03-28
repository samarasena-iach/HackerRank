package ProblemSolving;

import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
public class Apple_And_Orange {
    /**
     * Explanation
     * <p>
     * Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
     * Using the information given below, determine the number of apples and oranges that land on Sam's house.
     * <p>
     * Example
     * Sam's house is between S=7 and T=10.
     * The apple tree is located at A=4 and the orange at B=12.
     * There are M=3 apples and N=3 oranges.
     * Apples are thrown APPLES=[2,3,-4] units distance from A, and ORANGES=[3,-2,-4] units distance.
     * Adding each apple distance to the position of the tree, they land at [4+2, 4+3, 4+(-4)] = [6,7,0].
     * Oranges land at [12+3, 12+(-2), 12+(-4)] = [15,10,8].
     * One apple and two oranges land in the inclusive range 7-10, so we print 1,2
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApples = 0, countOranges = 0;

        for (int i = 0; i < apples.size(); i++) {
            int temp = apples.get(i);
            if ((a + temp) >= s && (a + temp) <= t) {
                countApples++;
            }
        }

        for (int i = 0; i < oranges.size(); i++) {
            int temp = oranges.get(i);
            if ((b + temp) >= s && (b + temp) <= t) {
                countOranges++;
            }
        }

        System.out.println(countApples + "\n" + countOranges);
    }

    public static void main(String[] args) {
        // s: integer, starting point of Sam's house location.
        // t: integer, ending location of Sam's house location.
        // a: integer, location of the Apple tree.
        // b: integer, location of the Orange tree.
        // apples: integer array, distances at which each apple falls from the tree.
        // oranges: integer array, distances at which each orange falls from the tree.

        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;

        List<Integer> apples = Arrays.asList(-2, 2, 1);
        List<Integer> oranges = Arrays.asList(5, -6);

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}
