package ProblemSolving;

import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true
public class The_Hurdle_Race {
    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
        Integer max = height.get(0);

        for (Integer i : height) {
            if (i > max) {
                max = i;
            }
        }

        int noOfDoses = max - k;

        return noOfDoses > 0 ? noOfDoses : 0;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 3, 2});
        System.out.println(hurdleRace(1, list));
    }
}
