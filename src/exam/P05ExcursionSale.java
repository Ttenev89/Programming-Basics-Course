package exam;

import java.util.Scanner;

public class P05ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seaVacation = Integer.parseInt(scanner.nextLine());
        int mountainVacation = Integer.parseInt(scanner.nextLine());


        int profit = 0;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            if (input.equals("sea") && seaVacation != 0) {
                profit += 680;
                seaVacation--;

            } else if (input.equals("mountain") && mountainVacation != 0){
                profit += 499;
                mountainVacation--;

            }

            if (seaVacation == 0 && mountainVacation == 0) {
                break;
            }



            input = scanner.nextLine();
        }

        if (seaVacation == 0 && mountainVacation == 0) {
            System.out.printf("Good job! Everything is sold.%nProfit: %d leva.", profit);
        } else {
            System.out.printf("Profit: %d leva.", profit);
        }
    }
}
