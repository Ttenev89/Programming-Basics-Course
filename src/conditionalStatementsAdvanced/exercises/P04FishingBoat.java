package conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermanCount = Integer.parseInt(scanner.nextLine());

        int rent;
        double price = 0;

        switch (season) {
            case "Spring":
                rent = 3000;
                if (fishermanCount <= 6) {
                    price = rent - rent * 0.10;
                } else if (fishermanCount <= 11) {
                    price = rent - rent * 0.15;
                } else {
                    price = rent - rent * 0.25;
                }
                if (fishermanCount % 2 == 0) {
                    price = price - price * 0.05;
                }
                break;
            case "Summer":
                rent = 4200;
                if (fishermanCount <= 6) {
                    price = rent - rent * 0.10;
                } else if (fishermanCount <= 11) {
                    price = rent - rent * 0.15;
                } else {
                    price = rent - rent * 0.25;
                }
                if (fishermanCount % 2 == 0) {
                    price = price - price * 0.05;
                }
                break;
            case "Autumn":
                rent = 4200;
                if (fishermanCount <= 6) {
                    price = rent - rent * 0.10;
                } else if (fishermanCount <= 11) {
                    price = rent - rent * 0.15;
                } else  {
                    price = rent - rent * 0.25;
                }
                break;
            case "Winter":
                rent = 2600;
                if (fishermanCount <= 6) {
                    price = rent - rent * 0.10;
                } else if (fishermanCount <= 11) {
                    price = rent - rent * 0.15;
                } else {
                    price = rent - rent * 0.25;
                }
                if (fishermanCount % 2 == 0) {
                    price = price - price * 0.05;
                }
                break;
        }
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
