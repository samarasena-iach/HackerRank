package Thirty_Days_Of_Coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem?isFullScreen=true
public class Day08_Dictionaries_And_Maps {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();

            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
