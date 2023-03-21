package Algorithms;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
    }

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) {
                zeros++;
            } else if (arr.get(i) > 0) {
                positiveNumbers++;
            } else if (arr.get(i) < 0) {
                negativeNumbers++;
            }
        }

        System.out.println(String.format("%.6f", positiveNumbers * 1.0 / n));
        System.out.println(String.format("%.6f", negativeNumbers * 1.0 / n));
        System.out.println(String.format("%.6f", zeros * 1.0 / n));
    }
}
