package examPrepare.P04Exam2And3May2019;

import java.util.Scanner;

public class P04TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double income = 0;
        String product = scanner.nextLine();
        int count = 0;
        int totalCount = 0;

        while (!product.equals("Stop")) {

            double price = Double.parseDouble(scanner.nextLine());

            count++;
            totalCount++;

            if (count == 3) {
                price -= price * 0.5;
                income += price;
                count = 0;
            } else {
                income += price;
            }

            if (income > budget) {
                System.out.printf("You don't have enough money!%nYou need %.2f leva!", Math.abs(budget - income));
                break;
            }

            product = scanner.nextLine();
        }

        if (budget >= income) {
            System.out.printf("You bought %d products for %.2f leva.", totalCount, income);
        }
    }
}