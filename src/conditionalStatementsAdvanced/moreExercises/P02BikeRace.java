package conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorCyclist = Integer.parseInt(scanner.nextLine());
        int seniorCyclist = Integer.parseInt(scanner.nextLine());
        String raceType = scanner.nextLine();

        double sum = 0;

        switch (raceType) {
            case "trail":
                sum = juniorCyclist * 5.5 + seniorCyclist * 7;
                break;
            case "cross-country":
                sum = juniorCyclist * 8 + seniorCyclist * 9.5;

                if (juniorCyclist + seniorCyclist >= 50) {
                    sum = sum - sum * 0.25;
                }
                break;
            case "downhill":
                sum = juniorCyclist * 12.25 + seniorCyclist * 13.75;
                break;
            case "road":
                sum = juniorCyclist * 20 + seniorCyclist * 21.5;
                break;
        }

        double totalsum = sum - sum * 0.05;

        System.out.printf("%.2f", totalsum);
    }
}
