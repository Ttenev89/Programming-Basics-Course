package conditionalStatements.exercises;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double dressStatistsPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double dressPrice = statists * dressStatistsPrice;

        if (statists > 150){
            dressPrice = dressPrice - dressPrice * 0.10;
        }

        double totalSum = decorPrice + dressPrice;

        if (totalSum > budget){
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", totalSum - budget);
        } else{
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.",budget - totalSum );
        }
    }
}
