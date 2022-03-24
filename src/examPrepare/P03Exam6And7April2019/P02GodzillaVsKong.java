package examPrepare.P03Exam6And7April2019;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistCount = Integer.parseInt(scanner.nextLine());
        double statistDressPrice = Double.parseDouble(scanner.nextLine());

        double decor =  budget * 0.10;
        double totalDressPrice = statistCount * statistDressPrice;

        if (statistCount > 150) {
            totalDressPrice -= totalDressPrice * 0.10;
        }

        double totalMoneyNeed = decor + totalDressPrice;

        if (totalMoneyNeed <= budget) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - totalMoneyNeed);
        } else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", totalMoneyNeed - budget);
        }
    }
}
