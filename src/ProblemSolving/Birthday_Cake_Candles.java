package ProblemSolving;

import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
public class Birthday_Cake_Candles {
    /**
     * Explanation
     * <p>
     * You are in charge of the cake for a child's birthday.
     * You have decided the cake will have one candle for each year of their total age.
     * They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
     * <p>
     * Example
     * candles = [4,4,1,3]
     * The maximum height candles are 4 units high. There are 2 of them, so return 2.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        int n = candles.size();
        int maxHeightCandle = candles.get(0);
        int count = 0;

        for(int i=0; i<n; i++){
            if(candles.get(i) > maxHeightCandle){
                maxHeightCandle = candles.get(i);
            }else if(candles.get(i) == maxHeightCandle){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(Arrays.asList(3, 2, 1, 3)));
    }
}
