package nestedLoops.exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());

        double totalGradesSum = 0;
        double countGrades = 0;

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {

            String presentationName = input;
            double sumCurrentPres = 0;

            for (int i = 1; i <= jury ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countGrades++;
                sumCurrentPres += grade;
            }

            totalGradesSum += sumCurrentPres;
            System.out.printf("%s - %.2f.%n", presentationName, sumCurrentPres / jury);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalGradesSum / countGrades);
    }
}
