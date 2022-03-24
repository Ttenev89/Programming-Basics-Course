package forLoop.moreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int studentsCount = Integer.parseInt(scanner.nextLine());

        double topStudents = 0;
        double averageStudents = 0;
        double poorStudents = 0;
        double failedStudents = 0;

        double sum = 0;

        for (int i = 1; i <= studentsCount; i++) {

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 3) {
                failedStudents++;
            } else if (grade >= 3 && grade <= 3.99) {
                poorStudents++;
            } else if (grade >= 4 && grade <= 4.99) {
                averageStudents++;
            } else {
                topStudents++;
            }

            sum += grade;
        }

        double averageGrade = sum / studentsCount;

        System.out.printf("Top students: %.2f%%%n", (topStudents * 100) / studentsCount);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (averageStudents * 100) / studentsCount);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (poorStudents * 100) / studentsCount);
        System.out.printf("Fail: %.2f%%%n", (failedStudents * 100) / studentsCount);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
