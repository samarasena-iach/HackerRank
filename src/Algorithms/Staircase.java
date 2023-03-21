package Algorithms;

public class Staircase {
    public static void main(String[] args) {
        staircase(6);
    }

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
