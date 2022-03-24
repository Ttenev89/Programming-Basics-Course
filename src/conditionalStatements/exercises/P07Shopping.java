package conditionalStatements.exercises;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardCount = Integer.parseInt(scanner.nextLine());
        int processorCount = Integer.parseInt(scanner.nextLine());
        int ramMemoryCount = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCardCount * 250;
        double processorPrice = (videoCardPrice * 0.35) * processorCount;
        double ramMemoryPrice = (videoCardPrice * 0.10) * ramMemoryCount;

        double sum = videoCardPrice + processorPrice + ramMemoryPrice;

        double discount = 0;
        if (videoCardCount > processorCount){
            discount = sum * 0.15;
        }

        double finalPrice = sum - discount;

        if (budget >= finalPrice){
            System.out.printf("You have %.2f leva left!", budget - finalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalPrice - budget);
        }



    }
}
