package firstStepInCodding.lab;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countDog = Integer.parseInt(scanner.nextLine());
        int restPets = Integer.parseInt(scanner.nextLine());

        double foodPrice = countDog * 2.50 + restPets * 4;

        System.out.printf("%.1f lv.", foodPrice);
    }
}
