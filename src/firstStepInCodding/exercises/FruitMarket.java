package firstStepInCodding.exercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberry = Double.parseDouble(scanner.nextLine());
        double bananasCount = Double.parseDouble(scanner.nextLine());
        double orangeCount = Double.parseDouble(scanner.nextLine());
        double raspberryCount = Double.parseDouble(scanner.nextLine());
        double strawberryCount = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberry * 0.5;
        double orangePrice = raspberryPrice * 0.6;
        double bananasPrice = raspberryPrice * 0.2;

        double totalSum = strawberry * strawberryCount + raspberryPrice * raspberryCount
                + orangePrice * orangeCount + bananasPrice * bananasCount;

        System.out.printf("%.2f", totalSum);



    }
}
