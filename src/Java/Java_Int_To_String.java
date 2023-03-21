package Java;

import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
public class Java_Int_To_String {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            //String s=???; Complete this line below

            String s = Integer.toString(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
