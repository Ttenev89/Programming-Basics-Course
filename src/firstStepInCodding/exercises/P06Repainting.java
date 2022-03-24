package firstStepInCodding.exercises;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonSum = (nylon + 2) * 1.50;
        double paintSum = (paint + (paint * 0.1)) * 14.50;
        double thinnerSum = thinner * 5.00;
        double bagsSum = 0.40;

        double materialsSum = nylonSum + paintSum + thinnerSum + bagsSum;
        double mastersSum = (materialsSum * 0.3) * hours;
        double totalSum = materialsSum + mastersSum;

        System.out.println(totalSum);

    }
}
