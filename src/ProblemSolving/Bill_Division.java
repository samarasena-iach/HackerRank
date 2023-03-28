package ProblemSolving;

import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
public class Bill_Division {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sumOfConsumedItems = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sumOfConsumedItems += bill.get(i);
            }
        }
        int costPerPerson = sumOfConsumedItems / 2;

        System.out.println("Bill : " + bill.toString());
        System.out.println("Cost of the item which Anna didn't consume : " + bill.get(k));
        System.out.println("Sum of the consumed items : " + sumOfConsumedItems);
        System.out.println("Sum which each of them has to pay : " + (sumOfConsumedItems / 2));
        System.out.println("Cost which Brian charged Anna : " + b);

        if (b > costPerPerson) {
            System.out.println(b - costPerPerson);
        }else{
            System.out.println("Bon Appetit");
        }
    }

    public static void main(String[] args) {
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 12);
    }
}
