package examPrepare.P01;

import java.util.Scanner;

public class P02addBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBaggage = Double.parseDouble(scanner.nextLine());
        int kg = Integer.parseInt(scanner.nextLine());
        int leftDays = Integer.parseInt(scanner.nextLine());
        int baggage = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (kg < 10) {
            price = priceBaggage * 0.20;
        } else if (kg <= 20) {
            price = priceBaggage * 0.50;
        } else  {
            price = priceBaggage;
        }

        if (leftDays > 30) {
            price = price + price * 0.10;
        } else if (leftDays < 7) {
            price = price + price * 0.40;
        } else  {
            price = price + price * 0.15;
        }

        System.out.printf("The total price of bags is: %.2f lv.", price * baggage);

    }
}
