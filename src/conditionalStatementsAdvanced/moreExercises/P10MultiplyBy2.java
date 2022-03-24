package conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            double number = Double.parseDouble(scanner.nextLine());

            number = number * 2;

            if (number >= 0) {
                System.out.printf("Result: %.2f%n", number);
            } else {
                System.out.println("Negative number!");
            }

            if (number < 0) {
                break;
            }
        }


    }
}
