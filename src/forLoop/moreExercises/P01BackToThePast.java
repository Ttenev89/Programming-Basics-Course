package forLoop.moreExercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heritageMoney = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        int currentAge = 18;

        for (int i = 1800; i <= year ; i++) {

            if (i % 2 == 0) {
                heritageMoney -= 12000;
            } else {
                heritageMoney -= 12000 + currentAge * 50;
            }

            currentAge++;

        }

        if (heritageMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", heritageMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(heritageMoney));
        }
    }
}
