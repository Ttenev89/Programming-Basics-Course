package firstStepInCodding.lab;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double square = Double.parseDouble(scanner.nextLine());

        double allGreening = square * 7.61;
        double discount = allGreening * 0.18;
        double finalPrice = allGreening - discount;


        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
