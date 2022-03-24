package whileLoop.moreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int needMoney = Integer.parseInt(scanner.nextLine());

        int cashSum = 0;
        int cardSum = 0;
        int payType = 0;
        int cashPay = 0;
        int cardPay = 0;
        int totalSum = 0;
        boolean sumIsEnough = false;

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            int transaction = Integer.parseInt(input);
            payType++;

            if (payType % 2 == 0) {
                if (transaction < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cardSum += transaction;
                    totalSum += transaction;
                    cardPay++;
                }
            } else {
                if (transaction > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cashSum += transaction;
                    totalSum += transaction;
                    cashPay++;
                }
            }

            if (totalSum >= needMoney) {
                sumIsEnough = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (sumIsEnough) {
            System.out.printf("Average CS: %.2f%n", cashSum * 1.00 / cashPay);
            System.out.printf("Average CC: %.2f", cardSum * 1.00 / cardPay);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
