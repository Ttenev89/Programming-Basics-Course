package conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String destination = "";
        String sleepy = "";


        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.30;
                sleepy = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.70;
                sleepy = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.40;
                sleepy = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.80;
                sleepy = "Hotel";
            }
        } else {
            destination = "Europe";
            price = budget * 0.90;
            sleepy = "Hotel";
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", destination, sleepy, price);
    }
}
