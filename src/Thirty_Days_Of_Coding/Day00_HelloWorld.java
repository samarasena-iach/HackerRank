package Thirty_Days_Of_Coding;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/30-hello-world/problem?isFullScreen=true
public class Day00_HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();

        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
