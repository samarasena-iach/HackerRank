package ProblemSolving;

import java.util.Arrays;

// Link: https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
public class Time_Conversion {
    /**
     * Explanation
     * <p>
     * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
     * <p>
     * Example
     * s = '12:01:00PM' Return '12:01:00'.
     * s = '12:01:00AM' Return '00:01:00'.
     */

    public static String timeConversion(String time) {
        String[] timeArray = time.split(":");
        String hr = timeArray[0];
        String min = timeArray[1];
        String sec = timeArray[2].substring(0, 2);

        int Hours;
        if (timeArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
            if (Integer.parseInt(hr) < 12) {
                Hours = Integer.parseInt(hr);
                Hours += 12;
                hr = Integer.toString(Hours);
            }
        }
        if (timeArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
            if (Integer.parseInt(hr) == 12) {
                hr = "00";
            }
        }

        return hr + ":" + min + ":" + sec;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }
}
