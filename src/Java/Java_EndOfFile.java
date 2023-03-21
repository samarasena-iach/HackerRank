package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
public class Java_EndOfFile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int lineNum = 1;

        while (userInput.hasNextLine() == true) {
            if (userInput.hasNext() == true) {
                System.out.println(lineNum + " " + userInput.nextLine());
                lineNum++;
            }
        }
    }
}
