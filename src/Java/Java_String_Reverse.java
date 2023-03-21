package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
public class Java_String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String reverseA = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(reverseA) ? "Yes" : "No");
    }
}
