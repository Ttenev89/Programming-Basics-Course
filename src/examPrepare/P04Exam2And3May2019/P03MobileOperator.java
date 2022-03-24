package examPrepare.P04Exam2And3May2019;

import java.util.Scanner;

public class P03MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contractTerm = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String addedInternet = scanner.nextLine();
        int mountsCount = Integer.parseInt(scanner.nextLine());


        double tax = 0;

        if (contractTerm.equals("one")) {
            switch (typeContract) {
                case "Small":
                    tax = 9.98;
                    break;
                case "Middle":
                    tax = 18.99;
                    break;
                case "Large":
                    tax = 25.98;
                    break;
                case "ExtraLarge":
                    tax = 35.99;
                    break;
            }
        } else if (contractTerm.equals("two")) {
            switch (typeContract) {
                case "Small":
                    tax = 8.58;
                    break;
                case "Middle":
                    tax = 17.09;
                    break;
                case "Large":
                    tax = 23.59;
                    break;
                case "ExtraLarge":
                    tax = 31.79;
                    break;
            }
        }

        if (addedInternet.equals("yes")) {
            if (tax <= 10) {
                tax += 5.50;
            } else if (tax <= 30) {
                tax += 4.35;
            } else {
                tax += 3.85;
            }
        }

        double finalPrice = tax * mountsCount;

        if (contractTerm.equals("two")) {
            finalPrice = finalPrice - finalPrice * 0.0375;
        }

        System.out.printf("%.2f lv.", finalPrice);

    }
}
