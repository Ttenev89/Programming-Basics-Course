package forLoop.moreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargoCount = Integer.parseInt(scanner.nextLine());

        double busCount = 0;
        double truckCount = 0;
        double trainCount = 0;

        double busPrice = 0;
        double truckPrice = 0;
        double trainPrice = 0;

        double cargoTonnageCount = 0;


        for (int i = 1; i <= cargoCount; i++) {

            double cargoTonnage = Integer.parseInt(scanner.nextLine());

            cargoTonnageCount += cargoTonnage;

            if (cargoTonnage <= 3) {
                busCount += cargoTonnage;
                busPrice = busCount * 200;
            } else if (cargoTonnage <= 11) {
                truckCount += cargoTonnage;
                truckPrice = truckCount * 175;
            } else {
                trainCount += cargoTonnage;
                trainPrice = trainCount * 120;
            }


        }

        double averagePerTon = (busPrice + truckPrice + trainPrice) / cargoTonnageCount;

        System.out.printf("%.2f%n", averagePerTon);
        System.out.printf("%.2f%%%n", busCount / cargoTonnageCount * 100);
        System.out.printf("%.2f%%%n", truckCount / cargoTonnageCount * 100);
        System.out.printf("%.2f%%%n", trainCount / cargoTonnageCount * 100);
    }
}
