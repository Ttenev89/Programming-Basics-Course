package conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double transportPrice = 0;


        if (peopleCount < 5) {
            transportPrice = budget * 0.75;
        } else if (peopleCount < 10) {
            transportPrice = budget * 0.60;
        } else if (peopleCount < 25) {
            transportPrice = budget * 0.50;
        } else if (peopleCount < 50) {
            transportPrice = budget * 0.40;
        } else {
            transportPrice = budget * 0.25;
        }

        double ticket = 0;

        if (category.equals("VIP")) {
            ticket = 499.99 * peopleCount;
        } else if (category.equals("Normal")){
            ticket = 249.99 * peopleCount;
        }

        double finalPrice = Math.abs(budget - transportPrice - ticket);

        if (budget >= transportPrice + ticket) {
            System.out.printf("Yes! You have %.2f leva left.", finalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", finalPrice);
        }
    }
}
