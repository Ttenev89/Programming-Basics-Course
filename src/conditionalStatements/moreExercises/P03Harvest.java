package conditionalStatements.moreExercises;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareMeter = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int littersWine = Integer.parseInt(scanner.nextLine());
        int employeesCount = Integer.parseInt(scanner.nextLine());

        double totalGrape = squareMeter * grapePerSquareMeter;
        double wine = totalGrape * 0.4 / 2.5;

        if (wine >= littersWine){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n" +
                    "%.0f liters left -> %.0f liters per person.", Math.floor(wine), Math.ceil(wine - littersWine), Math.ceil((wine- littersWine) / employeesCount));
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(littersWine - wine));
        }
    }
}
