package conditionalStatements.moreExercises;

import java.util.Scanner;

public class P06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int allFood = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        double needFood = daysCount * dogFood + daysCount * catFood + (daysCount * turtleFood) /1000;

        if (needFood <= allFood){
            System.out.printf("%.0f kilos of food left.", Math.floor(allFood - needFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(needFood - allFood));
        }
    }
}
