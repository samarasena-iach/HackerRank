package ProblemSolving;

import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true
public class Designer_PDF_Viewer {
    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        int n = 26;
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            int item = h.get(i);
            intArray[i] = item;
        }

        int max = intArray[word.charAt(0) - 97];
        for (int i = 1; i < word.length(); i++) {
            if (max < intArray[word.charAt(i) - 97]) {
                max = intArray[word.charAt(i) - 97];
            }
        }

        return word.length() * max;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5});
        String word = "abc";
        System.out.println(designerPdfViewer(list, word));
    }

}
