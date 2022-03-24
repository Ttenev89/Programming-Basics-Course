package examPrepare.P04Exam2And3May2019;

import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangeQuantity = Double.parseDouble(scanner.nextLine());
        double raspberryQuantity = Double.parseDouble(scanner.nextLine());
        double strawberryQuantity = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice - strawberryPrice * 0.50;
        double orangePrice = raspberryPrice  - raspberryPrice * 0.40;
        double bananasPrice = raspberryPrice - raspberryPrice * 0.80;

        double totalPrice = strawberryPrice * strawberryQuantity + raspberryPrice * raspberryQuantity + orangePrice * orangeQuantity
                + bananasPrice * bananasQuantity;

        System.out.printf("%.2f", totalPrice);
    }
}
