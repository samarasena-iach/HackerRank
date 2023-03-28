package ProblemSolving;

// Link: https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true
public class Number_Line_Jumps {
    /**
     * Explanation
     * <p>
     * You are choreographing a circus show with various animals.
     * For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
     * The first kangaroo starts at location X1 and moves at a rate of V1 meters per jump.
     * The second kangaroo starts at location X2 and moves at a rate of V2 meters per jump.
     * You have to figure out a way to get both kangaroos at the same location at the same time as part of the show.
     * If it is possible, return YES, otherwise return NO.
     * <p>
     * Example
     * X1 = 2, V1 = 1, X2 = 1, V2 = 2
     * After one jump, they are both at X=3, (X1+V1=2+1, X2+V2=1+2), so the answer is YES.
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        for (int i = 0; i < 10000; i++) {
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x1 == x2) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        // x1: Starting point of 1st Kangaroo
        // v1: Movement/Jump rate of 1st Kangaroo
        // x2: Starting point of 2nd Kangaroo
        // v2: Movement/Jump rate of 2nd Kangaroo

        int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;

        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}
