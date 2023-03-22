package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
public class Compare_The_Triplets {
    /**
     * Explanation
     * <p>
     * Alice and Bob each created one problem for HackerRank.
     * A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories:
     * problem clarity, originality, and difficulty.
     * <p>
     * The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]),
     * and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).
     * <p>
     * The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
     * <p>
     * If a[i] > b[i], then Alice is awarded 1 point.
     * If a[i] < b[i], then Bob is awarded 1 point.
     * If a[i] = b[i], then neither person receives a point.
     * <p>
     * Comparison points is the total points a person earned.
     * Given a and b, determine their respective comparison points.
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>();

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore += 1;
            } else if (b.get(i) > a.get(i)) {
                bobScore += 1;
            }
        }

        scores.add(aliceScore);
        scores.add(bobScore);
        return scores;
    }

    public static void main(String[] args) {
        List<Integer> list01 = Arrays.asList(5, 6, 7);
        List<Integer> list02 = Arrays.asList(3, 6, 10);
        System.out.println(compareTriplets(list01, list02));
    }
}
