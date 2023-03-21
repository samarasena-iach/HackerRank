package InterviewPreparationKit.WarmUpChallenges;

// Link: https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));

        // Other Inputs
        // "a", 1000000000000
    }

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
}
