package firstStepInCodding.exercises;

import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int campaignDays = Integer.parseInt(scanner.nextLine());
        int pastryCount = Integer.parseInt(scanner.nextLine());
        int cakeCount = Integer.parseInt(scanner.nextLine());
        int wafflesCount = Integer.parseInt(scanner.nextLine());
        int pancakesCount = Integer.parseInt(scanner.nextLine());

        double cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;

        double sumPerDay = (cakeCount * cakePrice + wafflesCount * wafflePrice + pancakesCount * pancakePrice) * pastryCount;
        double totalSum = (sumPerDay * campaignDays) * 7 /8;

        System.out.printf("%.2f",totalSum);
    }
}
