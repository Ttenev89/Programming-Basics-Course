package firstStepInCodding.exercises;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double totalLiters = volume * 0.001;
        totalLiters = totalLiters - totalLiters * percent / 100;

        System.out.printf("%.2f", totalLiters);
    }
}
