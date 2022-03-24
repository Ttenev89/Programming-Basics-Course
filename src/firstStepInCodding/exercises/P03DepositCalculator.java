package firstStepInCodding.exercises;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositTerm = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double interest = (depositSum * interestRate / 100) / 12;
        double sum = depositSum + (depositTerm * interest);

        System.out.println(sum);

    }

}
