package conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int chrysanthemumsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int tulipsCount = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String isHoliday = scanner.nextLine();

        double sum = 0;

        if (season.equals("Spring") || season.equals("Summer")) {
            sum = chrysanthemumsCount * 2 + rosesCount * 4.1 + tulipsCount * 2.5;
            if (isHoliday.equals("Y")) {
                sum = sum + sum * 0.15;
            }
            if (season.equals("Spring") && tulipsCount > 7) {
                sum = sum - sum * 0.05;
            }
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            sum = chrysanthemumsCount * 3.75 + rosesCount * 4.5 + tulipsCount * 4.15;
            if (isHoliday.equals("Y")) {
                sum = sum + sum * 0.15;
            }
            if (season.equals("Winter") && rosesCount >= 10) {
                sum = sum - sum * 0.10;
            }
        }

        if (chrysanthemumsCount + rosesCount + tulipsCount > 20) {
            sum = sum - sum * 0.20;
        }

        double flourPrice = sum + 2;

        System.out.printf("%.2f", flourPrice);
    }
}
