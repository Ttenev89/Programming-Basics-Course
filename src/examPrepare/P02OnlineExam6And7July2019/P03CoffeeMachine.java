package examPrepare.P02OnlineExam6And7July2019;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String beverage = scanner.nextLine();
        String sugar = scanner.nextLine();
        int beverageCount = Integer.parseInt(scanner.nextLine());

        double totalSum;
        double sum = 0;

        if (sugar.equals("Without")) {
            switch (beverage) {
                case "Espresso":
                    sum = 0.90 - 0.90 * 0.35;
                    break;
                case "Cappuccino":
                    sum = 1.00 - 1 * 0.35;
                    break;
                case "Tea":
                    sum = 0.50 - 0.50 * 0.35;
                    break;
            }
        } else if (sugar.equals("Normal")) {
            switch (beverage) {
                case "Espresso":
                    sum = 1.00;
                    break;
                case "Cappuccino":
                    sum = 1.20;
                    break;
                case "Tea":
                    sum = 0.60;
                    break;
            }
        } else if (sugar.equals("Extra")) {
            switch (beverage) {
                case "Espresso":
                    sum = 1.20;
                    break;
                case "Cappuccino":
                    sum = 1.60;
                    break;
                case "Tea":
                    sum = 0.70;
                    break;
            }
        }

        if (beverage.equals("Espresso") && beverageCount >= 5) {
            sum -=  sum * 0.25;
        }

        totalSum = sum * beverageCount;

        if (totalSum > 15) {
            totalSum -= totalSum * 0.20;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", beverageCount, beverage, totalSum);
    }
}