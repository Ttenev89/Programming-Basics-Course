package conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        if (kilometersPerMonth <= 5000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    sum = kilometersPerMonth * 0.75 * 4;
                    break;
                case "Summer":
                    sum = kilometersPerMonth * 0.90 * 4;
                    break;
                case "Winter":
                    sum = kilometersPerMonth * 1.05 * 4;
                    break;
            }
        } else if (kilometersPerMonth > 5000 && kilometersPerMonth <= 10000) {
            switch (season) {
                case "Spring":
                case "Autumn":
                    sum = kilometersPerMonth * 0.95 * 4;
                    break;
                case "Summer":
                    sum = kilometersPerMonth * 1.10 * 4;
                    break;
                case "Winter":
                    sum = kilometersPerMonth * 1.25 * 4;
                    break;
            }
        } else {
            if (season.equals("Spring") || season.equals("Autumn") ||
                    season.equals("Summer") || season.equals("Winter")) {
                sum = kilometersPerMonth * 1.45 * 4;
            }
        }

        double totalSum = (sum - sum * 0.10);

        System.out.printf("%.2f", totalSum);
    }
}
