package examPrepare.P02OnlineExam6And7July2019;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countNight = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int extraCostPercent = Integer.parseInt(scanner.nextLine());

        double extraCost = 0;
        double totalPrice = 0;
        double nightPrice = 0;

        if (countNight > 7) {
            pricePerNight = pricePerNight - pricePerNight * 0.05;
        }
        nightPrice = countNight * pricePerNight;
        extraCost = budget * (extraCostPercent * 1.00 / 100);
        totalPrice = nightPrice + extraCost;

        if (budget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", totalPrice - budget);
        }
    }
}
