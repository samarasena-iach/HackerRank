package Thirty_Days_Of_Coding;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/30-conditional-statements/problem?isFullScreen=true
public class Day03_Intro_To_Conditional_Statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        if (n % 2 == 1) {
            ans = "Weird";
        } else if ((n % 2 == 0) && (n >= 2) && (n <= 5)) {
            ans = "Not Weird";
        } else if ((n % 2 == 0) && (n >= 6) && (n <= 20)) {
            ans = "Weird";
        } else if ((n % 2 == 0) && (n > 20)) {
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
