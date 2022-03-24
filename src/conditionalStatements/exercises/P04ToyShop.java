package conditionalStatements.exercises;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        double dolls = Double.parseDouble(scanner.nextLine());
        double bears = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double trucks = Double.parseDouble(scanner.nextLine());

        double sumToys = (puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2);

        double toysCount = puzzles + dolls + bears + minions + trucks;

        double discount = 0;

        if (toysCount >= 50) {
            discount = sumToys * 0.25;
        }

        double finalPrice = sumToys - discount;

        double rent = finalPrice * 0.10;

        double profit = finalPrice - rent;



        if (profit >= vacationPrice) {
            System.out.printf("Yes! %.2f lv left.", profit - vacationPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", vacationPrice - profit);
        }

    }
}
