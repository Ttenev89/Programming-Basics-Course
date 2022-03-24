package conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double sum = 0;

        switch (operator) {
            case "+":
                sum = n1 + n2;
                System.out.printf("%d + %d = %.0f", n1, n2, sum);
                if (sum % 2 == 0) {
                    System.out.println(" - even");
                } else {
                    System.out.println(" - odd");
                }
                break;
            case "-":
                sum = n1 - n2;
                System.out.printf("%d - %d = %.0f", n1, n2, sum);
                if (sum % 2 == 0) {
                    System.out.println(" - even");
                } else {
                    System.out.println(" - odd");
                }
                break;
            case "*":
                sum = n1 * n2;
                System.out.printf("%d * %d = %.0f", n1, n2, sum);
                if (sum % 2 == 0) {
                    System.out.println(" - even");
                } else {
                    System.out.println(" - odd");
                }
                break;
            case "/":
                if (n1 == 0) {
                    System.out.printf("Cannot divide %d by zero", n2);
                } else if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    sum = n1 / (n2 * 1.00);

                    System.out.printf("%d / %d = %.2f", n1, n2, sum);
                }

                break;
            case "%":
                if (n1 == 0) {
                    System.out.printf("Cannot divide %d by zero", n2);
                } else if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    sum = n1 % n2;
                    System.out.printf("%d %% %d = %.0f", n1, n2, sum);
                }
                break;
        }

    }

}
