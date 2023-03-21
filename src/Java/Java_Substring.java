package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
public class Java_Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(getSubstring(S, start, end));
    }

    public static String getSubstring(String str, int start, int end) {
        return str.substring(start, end);
    }
}
