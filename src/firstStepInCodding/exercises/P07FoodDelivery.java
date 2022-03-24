package firstStepInCodding.exercises;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double menuPrice = (chickenMenu * 10.35 + fishMenu * 12.40 + vegetarianMenu * 8.15);
        double dessertPrice = menuPrice * 0.2;

        double totalrice = menuPrice + dessertPrice + 2.50;

        System.out.println(totalrice);
    }
}
