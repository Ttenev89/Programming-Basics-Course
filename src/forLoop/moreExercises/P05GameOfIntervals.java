package forLoop.moreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameMoves = Integer.parseInt(scanner.nextLine());

        double numFrom0To9 = 0;
        double numFrom10To19 = 0;
        double numFrom20To29 = 0;
        double numFrom30To39 = 0;
        double numFrom40To50 = 0;
        double invalidNumber = 0;

        double result = 0;

        for (int i = 1; i <= gameMoves; i++) {

            double digit = Double.parseDouble(scanner.nextLine());

            if (digit >= 0 && digit <= 9) {
                result += digit * 0.2;
                numFrom0To9++;
            } else if (digit >= 10 && digit <= 19) {
                result += digit * 0.3;
                numFrom10To19++;
            } else if (digit >= 20 && digit <= 29) {
                result += digit * 0.4;
                numFrom20To29++;
            } else if (digit >= 30 && digit <= 39) {
                result += 50;
                numFrom30To39++;
            } else if (digit >= 40 && digit <= 50) {
                result += 100;
                numFrom40To50++;
            } else {
                result /= 2;
                invalidNumber++;
            }

        }

        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", (numFrom0To9 * 100) / gameMoves);
        System.out.printf("From 10 to 19: %.2f%%%n", (numFrom10To19 * 100) / gameMoves);
        System.out.printf("From 20 to 29: %.2f%%%n", (numFrom20To29 * 100) / gameMoves);
        System.out.printf("From 30 to 39: %.2f%%%n", (numFrom30To39 * 100) / gameMoves);
        System.out.printf("From 40 to 50: %.2f%%%n", (numFrom40To50 * 100) / gameMoves);
        System.out.printf("Invalid numbers: %.2f%%%n", (invalidNumber * 100) / gameMoves);
    }
}
