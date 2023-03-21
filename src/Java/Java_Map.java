package Java;

import java.util.HashMap;
import java.util.Scanner;

// Link: https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
public class Java_Map {
    public static void main(String[] argh) {
        // Inputs
        // 01. n = 3, [{uncle sam, 99912222},{tom, 11122222},{harry,12299933}], query = {uncle sam, uncle tom, harry}

        Scanner in = new Scanner(System.in);
        int noOfContacts = in.nextInt();
        in.nextLine();

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (int i = 0; i < noOfContacts; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            hashMap.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();

            try {
                int temp = hashMap.get(s);
                System.out.println(s + "=" + temp);
            } catch (NullPointerException ex) {
                System.out.println("Not found");
            }
        }
    }
}
