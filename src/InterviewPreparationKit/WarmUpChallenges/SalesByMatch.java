package InterviewPreparationKit.WarmUpChallenges;

import java.util.HashMap;

// Link: https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=warmup
public class SalesByMatch {
    public static void main(String[] args) {
        System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

    static int sockMerchant(int n, int[] ar) {
        int matchingPairs = 0;
        HashMap inventory = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int color = ar[i];

            if (inventory.containsKey(color) && inventory.get(color).equals(new Integer(1))) {
                inventory.put(color, 0);
                matchingPairs++;
                continue;
            }
            inventory.put(color, 1);
        }

        return matchingPairs;
    }
}
