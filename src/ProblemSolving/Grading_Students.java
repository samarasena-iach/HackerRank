package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Link: https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true
public class Grading_Students {
    /**
     * Explanation
     * <p>
     * HackerLand University has the following grading policy:
     * Every student receives a grade in the inclusive range from 0 to 100.
     * Any grade less than 40 is a failing grade.
     * <p>
     * Sam is a professor at the university and likes to round each student's grade according to these rules:
     * <p>
     * If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
     * If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
     * <p>
     * Example
     * grade = 84 round to 85 (85 - 84 is less than 3)
     * grade = 29 do not round (result is less than 40)
     * grade = 57 do not round (60 - 57 is 3 or higher)
     * <p>
     * Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        int n = grades.size();

        for (int i = 0; i < n; i++) {
            Integer currentGrade = grades.get(i);
            roundedGrades.add(currentGrade < 38 || currentGrade % 5 < 3 ? currentGrade : currentGrade + (5 - currentGrade % 5));
        }

        return roundedGrades;
    }

    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(73, 67, 38, 33)));
    }
}
