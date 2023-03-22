package ProblemSolving;

// Link: https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true
public class Repeated_String {
    /**
     * Explanation
     * <p>
     * There is a string, s, of lowercase English letters that is repeated infinitely many times.
     * Given an integer, n, find and print the number of letter a's in the first n letters of the infinite string.
     * <p>
     * Example
     * s = 'abcac'
     * n = 10
     * The substring we consider is abcacabcac, the first 10 characters of the infinite string.
     * There are 4 occurrences of a in the substring.
     */

    static long repeatedString(String s, long n) {
        long countForSubstring = 0;
        long totalCount = 0;

        //Determines how many a's are in a substring
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countForSubstring++;
            }
        }

        //Determines how many complete substrings we will analyze
        long divisor = n / s.length();

        totalCount += divisor * countForSubstring;

        //Determines how many characters in we will analyze towards the end of our n range
        long remainder = n % s.length();

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                totalCount++;
            }
        }

        return totalCount;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));

        // Other Inputs
        // "a", 1000000000000
    }
}
