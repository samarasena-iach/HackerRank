package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
public class Java_Anagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() == b.length()) {
            int[] arrA = new int[256];
            int[] arrB = new int[256];
            for (int i = 0; i < a.length(); i++) {
                arrA[(int) a.charAt(i)] += 1;
                arrB[(int) b.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (arrA[i] != arrB[i])
                    return false;

            }
            return true;
        } else {
            return false;
        }
    }
}
