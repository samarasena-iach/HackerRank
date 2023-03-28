package Thirty_Days_Of_Coding;

// Link: https://www.hackerrank.com/challenges/30-recursion/problem?isFullScreen=true
public class Day09_Recursion_3 {
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);

            /**
             * BELOW CODE ALSO WORKS FINE
             * int i, factorial = 1;
             *
             * for (i = 1; i <= n; i++) {
             *    factorial = factorial * i;
             * }
             *
             * return factorial;
             */
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
