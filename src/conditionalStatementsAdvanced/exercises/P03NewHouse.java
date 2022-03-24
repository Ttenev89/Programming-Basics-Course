package conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double rosesPrice = 5;
        double dahliasPrice = 3.80;
        double tulipsPrice = 2.80;
        double narcissusPrice = 3;
        double gladiolusPrice = 2.50;

        double price = 0;

        switch (flowers) {
            case "Roses":
                price = rosesPrice * count;
                if (count > 80) {
                    price = price - price * 0.10;
                }
                break;
            case "Dahlias":
                price = dahliasPrice * count;
                if (count > 90) {
                    price = price - price * 0.15;
                }
                break;
            case "Tulips":
                price = tulipsPrice * count;
                if (count > 80) {
                    price = price - price * 0.15;
                }
                break;
            case "Narcissus":
                price = narcissusPrice * count;
                if (count < 120 ) {
                    price = price + price * 0.15;
                }
                break;
            case "Gladiolus":
                price = gladiolusPrice * count;
                if (count < 80)  {
                    price = price + price * 0.20;
                }
                break;
        }

        if ( price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
