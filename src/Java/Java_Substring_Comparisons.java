package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
public class Java_Substring_Comparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String curr = s.substring(i, i + k);

            if (smallest.compareTo(curr) > 0) {
                smallest = curr;
            }

            if (largest.compareTo(curr) < 0) {
                largest = curr;
            }
        }

        return smallest + "\n" + largest;
    }
}
