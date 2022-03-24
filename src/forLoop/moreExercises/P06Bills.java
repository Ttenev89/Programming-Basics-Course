package forLoop.moreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double totalElectricity = 0;

        for (int i = 1; i <= months; i++) {

            double electricityPerMonth = Double.parseDouble(scanner.nextLine());

            totalElectricity += electricityPerMonth;

        }

        double totalWater = months * 20;
        double totalInternet = months * 15;

        double cost = totalElectricity + totalWater + totalInternet;

        double otherCost = cost + cost * 0.2;

        double averageCost = (totalElectricity + totalWater + totalInternet + otherCost) / months;

        System.out.printf("Electricity: %.2f lv%n", totalElectricity);
        System.out.printf("Water: %.2f lv%n", totalWater);
        System.out.printf("Internet: %.2f lv%n", totalInternet);
        System.out.printf("Other: %.2f lv%n", otherCost);
        System.out.printf("Average: %.2f lv%n", averageCost);

    }
}
