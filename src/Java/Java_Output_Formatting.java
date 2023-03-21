package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
public class Java_Output_Formatting {
    public static void main(String[] args) {
        String formatted = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            if (x < 100) {
                formatted = String.format("%03d", x);
            } else {
                formatted = String.format("%d", x);
            }
            System.out.printf("%-14s %s\n", s1, formatted);
        }
        System.out.println("================================");
    }
}
