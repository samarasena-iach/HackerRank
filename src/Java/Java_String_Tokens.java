package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
public class Java_String_Tokens {
    public static void main(String[] args) {
        // Inputs
        // 01. s = "He is a very very good boy, isn't he?"
        // 02. s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!"

        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().trim().split("[ !,?\\._'@]+", 0);

        if (s.length == 1 && s[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(s.length);
            for (String st : s) {
                System.out.println(st);
            }
        }
    }
}
