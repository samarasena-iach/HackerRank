package Thirty_Days_Of_Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/30-review-loop/problem?isFullScreen=true
public class Day06_LetsReview {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }
        in.close();

        List<String> formattedWords = new ArrayList<>();
        Arrays.stream(words).forEach(s -> {
            char[] arr = s.toCharArray();
            int wordLength = arr.length;

            StringBuffer sb1 = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();

            for (int i = 0; i < wordLength; i++) {
                if (i % 2 == 0) {
                    sb1.append(arr[i]);
                } else {
                    sb2.append(arr[i]);
                }
            }

            formattedWords.add(sb1.toString() + " " + sb2.toString());
        });

        formattedWords.stream().forEach(s -> {
            System.out.println(s);
        });
    }
}
