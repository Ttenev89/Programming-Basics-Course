package examPrepare.P03Exam6And7April2019;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());

        int tickets = 0;
        int otherPurchase = 0;

        String product = scanner.nextLine();

        while (!product.equals("End")) {

            int price = 0;

            if (product.length() > 8) {
                price = product.charAt(0);
                price += product.charAt(1);
                if (budget - price < 0) {
                    break;
                } else {
                    tickets++;
                    budget -= price;
                }
            } else {
                price = product.charAt(0);
                if (budget - price < 0) {
                    break;
                } else {
                    otherPurchase++;
                    budget -= price;
                }
            }

            product = scanner.nextLine();
        }

        System.out.println(tickets);
        System.out.println(otherPurchase);
    }
}
