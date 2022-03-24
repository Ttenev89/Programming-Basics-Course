package examPrepare.P01;

import java.util.Scanner;

public class P06barcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        int f4 = n % 10;
        int f3 = (n / 10) % 10;
        int f2 = (n / 100) % 10;
        int f1 = (n / 1000) % 10;

        int h4 = m % 10;
        int h3 = (m / 10) % 10;
        int h2 = (m / 100) % 10;
        int h1 = (m / 1000) % 10;

        for (int i = f1; i <= h1; i++) {
            for (int j = f2; j <= h2; j++) {
                for (int k = f3; k <= h3; k++) {
                    for (int l = f4; l <= h4; l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.print(" " + i + j + k + l);
                        }
                    }
                }
            }
        }
    }
}
