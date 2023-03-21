package Java;

import java.util.Calendar;

// Link: https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
public class Java_Date_And_Time {
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, (month - 1), day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        String Day[] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        return (Day[dayOfWeek - 1]);
    }
}
