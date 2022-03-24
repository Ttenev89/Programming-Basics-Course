package forLoop.moreExercises;

import java.util.Scanner;

public class P11OddOrEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double n = Integer.parseInt(scanner.nextLine());

        if (n == 0) {
            System.out.println("OddSum=0.00,");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.println("EvenSum=0.00,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");

        }else {

        double oddSum = 0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double evenSum = 0;
        double evenMin = Integer.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE;


            for (int i = 1; i <= n; i++) {

                double digit = Double.parseDouble(scanner.nextLine());

                if (i % 2 == 0) {
                    evenSum += digit;

                    if (digit > evenMax) {
                        evenMax = digit;
                    }
                    if (digit < evenMin) {
                        evenMin = digit;
                    }
                } else {
                    oddSum += digit;

                    if (digit > oddMax) {
                        oddMax = digit;
                    }
                    if (digit < oddMin) {
                        oddMin = digit;
                    }
                }
            }


            System.out.printf("OddSum=%.2f,%n", oddSum);

            if (oddMin == Integer.MAX_VALUE) {
                System.out.printf("OddMin=No,%n");
            } else {
                System.out.printf("OddMin=%.2f,%n", oddMin);
            }

            if (oddMax == Integer.MIN_VALUE) {
                System.out.printf("OddMax=No,%n");
            } else {
                System.out.printf("OddMax=%.2f,%n", oddMax);
            }

            System.out.printf("EvenSum=%.2f,%n", evenSum);

            if (evenMin == Integer.MAX_VALUE) {
                System.out.printf("EvenMin=No,%n");
            } else {
                System.out.printf("EvenMin=%.2f,%n", evenMin);
            }

            if (evenMax == Integer.MIN_VALUE) {
                System.out.print("EvenMax=No");
            } else {
                System.out.printf("EvenMax=%.2f", evenMax);
            }

        }
    }
}
