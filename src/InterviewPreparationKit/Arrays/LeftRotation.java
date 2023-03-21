package InterviewPreparationKit.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class LeftRotation {
    public static void main(String[] args) {
        System.out.println(rotLeft(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}), 4));
    }

    static List<Integer> rotLeft(List<Integer> arr, int d) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.size(); i++) {
            list.add(arr.get((i + d) % arr.size()));
        }

        return list;
    }
}
