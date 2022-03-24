package firstStepInCodding.exercises;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rentHall = Integer.parseInt(scanner.nextLine());

        double cakePrice = rentHall * 0.2;
        double drinksPrice = cakePrice - (cakePrice * 45 / 100);
        double animatorPrice = rentHall / 3.0;

        double totalSum = rentHall + cakePrice + drinksPrice + animatorPrice;



        System.out.println(totalSum);
    }
}
