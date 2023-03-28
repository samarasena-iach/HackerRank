package ProblemSolving;

// Link: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true
public class Cats_And_A_Mouse {
    static String catAndMouse(int x, int y, int z) {
        String s = "";
        int catA_mouseC = Math.abs(z - x);
        int catB_mouseC = Math.abs(z - y);

        if (catA_mouseC < catB_mouseC) {
            s = "Cat A";
        } else if (catB_mouseC < catA_mouseC) {
            s = "Cat B";
        } else {
            s = "Mouse C";
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 3, 2));
    }
}
