package conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayForRest = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double pricePerNight = 0;
        int nightRest = dayForRest - 1;
        double totalSum = 0;

        switch (roomType) {
            case "room for one person":
                pricePerNight = 18;
                totalSum = nightRest * pricePerNight;
                if (evaluation.equals("positive")) {
                    totalSum = totalSum + totalSum * 0.25;
                } else {
                    totalSum = totalSum - totalSum * 0.10;
                }

                break;
            case "apartment":
                pricePerNight = 25;
                totalSum = nightRest * pricePerNight;
                if (dayForRest < 10) {
                    totalSum = totalSum - totalSum * 0.30;
                } else if (dayForRest <= 15) {
                    totalSum = totalSum - totalSum * 0.35;
                } else {
                    totalSum = totalSum - totalSum * 0.50;
                }
                if (evaluation.equals("positive")) {
                    totalSum = totalSum + totalSum * 0.25;
                } else {
                    totalSum = totalSum - totalSum * 0.10;
                }
                break;
            case "president apartment":
                pricePerNight = 35;
                totalSum = nightRest * pricePerNight;
                if (dayForRest < 10) {
                    totalSum = totalSum - totalSum * 0.10;
                } else if (dayForRest <= 15) {
                    totalSum = totalSum - totalSum * 0.15;
                } else {
                    totalSum = totalSum - totalSum * 0.20;
                }
                if (evaluation.equals("positive")) {
                    totalSum = totalSum + totalSum * 0.25;
                } else {
                    totalSum = totalSum - totalSum * 0.10;
                }
                break;
        }

        System.out.printf("%.2f", totalSum);
    }
}
