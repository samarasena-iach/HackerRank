package InterviewPreparationKit.WarmUpChallenges;

// Link: https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class CountingValleys {
    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUU");

        // Other Inputs
        // 12, "DDUUDDUDUUUD"
    }

    static int countingValleys(int n, String s) {
        int level = 0; //Start at sea level

        int valleys = 0;
        boolean belowSea = false;

        for(int i = 0; i < n; i++){
            char slope = s.charAt(i);

            if(slope == 'U'){
                //Uphill
                level++;
            }else{
                //Downhill
                level--;
            }

            //Handle transitions
            if(!belowSea && level < 0){
                valleys++;
                belowSea = true;
            }

            if(level >= 0){
                //We are back above sea level
                belowSea = false;
            }
        }

        System.out.println(valleys);

        return valleys;
    }
}
