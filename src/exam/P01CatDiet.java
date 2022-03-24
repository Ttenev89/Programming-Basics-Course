package exam;

import java.util.Scanner;

public class P01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fatPercent = Double.parseDouble(scanner.nextLine());
        double proteinsPercent = Double.parseDouble(scanner.nextLine());
        double carbohydratesPercent = Double.parseDouble(scanner.nextLine());
        double totalCalories = Double.parseDouble(scanner.nextLine());
        double waterPercent = Double.parseDouble(scanner.nextLine());

        double fatCalories = 9;
        double proteinCalories = 4;
        double carbohydrateCalories = 4;

        double fatCount = (totalCalories  * fatPercent / 100) / fatCalories;
        double proteinCount = (totalCalories  * proteinsPercent / 100) / proteinCalories;
        double carbohydratesCount = (totalCalories  * carbohydratesPercent / 100) / carbohydrateCalories;

        double weight = fatCount + proteinCount + carbohydratesCount;
        double weightPerGram = totalCalories / weight;
        double oneGram = weightPerGram - (weightPerGram * waterPercent) / 100;

        System.out.printf("%.4f", oneGram);

    }
}
