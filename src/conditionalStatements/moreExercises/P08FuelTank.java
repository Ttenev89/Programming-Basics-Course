package conditionalStatements.moreExercises;

import java.util.Locale;
import java.util.Scanner;

public class P08FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int fuelLitters = Integer.parseInt(scanner.nextLine());

        if (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas")){
            if (fuelLitters >= 25){
                System.out.printf("You have enough %s.", fuelType.toLowerCase(Locale.ROOT));
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase(Locale.ROOT));
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
