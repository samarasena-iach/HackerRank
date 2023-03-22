package ProblemSolving;

// Link: https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true
public class Counting_Valleys {
    /**
     * Explanation
     * <p>
     * An avid hiker keeps meticulous records of their hikes.
     * During the last hike that took exactly 'STEPS' steps,
     * for every step it was noted if it was an uphill, U, or a downhill, D step.
     * Hikes always start and end at sea level, and each step up or down represents a 1 unit change in altitude.
     * <p>
     * We define the following terms:
     * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
     * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
     * <p>
     * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
     * <p>
     * Example
     * steps = 8 path = [DDUUUUDD]
     * The hiker first enters a valley 2 units deep. Then they climb out and up onto a mountain 2 units high.
     * Finally, the hiker returns to sea level and ends the hike.
     */

    static int countingValleys(int n, String s) {
        int level = 0; //Start at sea level

        int valleys = 0;
        boolean belowSea = false;

        for (int i = 0; i < n; i++) {
            char slope = s.charAt(i);

            if (slope == 'U') {
                //Uphill
                level++;
            } else {
                //Downhill
                level--;
            }

            //Handle transitions
            if (!belowSea && level < 0) {
                valleys++;
                belowSea = true;
            }

            if (level >= 0) {
                //We are back above sea level
                belowSea = false;
            }
        }

        System.out.println(valleys);
        return valleys;
    }

    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUU");

        // Other Inputs
        // 12, "DDUUDDUDUUUD"
    }
}

