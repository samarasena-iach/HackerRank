package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
public class Breaking_The_Records {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int n = scores.size();

        int bestRecord = scores.get(0);
        int worstRecord = scores.get(0);

        int instancesOfBestRecordBreaks = 0;
        int instancesOfWorstRecordBreaks = 0;

        List<Integer> listOfRecordBreakingInstances = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (bestRecord < scores.get(i)) {
                bestRecord = scores.get(i);
                instancesOfBestRecordBreaks++;
            }

            if (worstRecord > scores.get(i)) {
                worstRecord = scores.get(i);
                instancesOfWorstRecordBreaks++;
            }

            System.out.println("***************************************");
            System.out.println("Instance : "+i);
            System.out.println("Score : "+scores.get(i));
            System.out.println("Current Best Score : "+bestRecord);
            System.out.println("Current Worst Score : "+worstRecord);
            System.out.println("***************************************");
            System.out.println();
        }

        listOfRecordBreakingInstances.add(instancesOfBestRecordBreaks);
        listOfRecordBreakingInstances.add(instancesOfWorstRecordBreaks);

        return listOfRecordBreakingInstances;
    }

    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
        System.out.println(breakingRecords(scores).toString());
    }
}
