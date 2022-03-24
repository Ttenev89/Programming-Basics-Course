package conditionalStatements.moreExercises;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();



        switch (fuelType) {
            case "Gas": {

                double litterAfterDiscount = 0;

                if (clubCard.equals("Yes")) {
                    litterAfterDiscount = 0.93 - 0.08;
                } else if (clubCard.equals("No")) {
                    litterAfterDiscount = 0.93;
                }

                double totalPrice = fuelQuantity * litterAfterDiscount;

                if (fuelQuantity >= 20 && fuelQuantity <= 25) {
                    totalPrice = totalPrice - (totalPrice * 0.08);
                } else if (fuelQuantity > 25) {
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }

                System.out.printf("%.2f lv.", totalPrice);

                break;
            }
            case "Gasoline": {

                double litterAfterDiscount = 0;

                if (clubCard.equals("Yes")) {
                    litterAfterDiscount = 2.22 - 0.18;
                } else if (clubCard.equals("No")) {
                    litterAfterDiscount = 2.22;
                }

                double totalPrice = fuelQuantity * litterAfterDiscount;

                if (fuelQuantity >= 20 && fuelQuantity <= 25) {
                    totalPrice = totalPrice - (totalPrice * 0.08);
                } else if (fuelQuantity > 25) {
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }

                System.out.printf("%.2f lv.", totalPrice);

                break;
            }
            case "Diesel": {

                double litterAfterDiscount = 0;

                if (clubCard.equals("Yes")) {
                    litterAfterDiscount = 2.33 - 0.12;
                } else if (clubCard.equals("No")) {
                    litterAfterDiscount = 2.33;
                }

                double totalPrice = fuelQuantity * litterAfterDiscount;

                if (fuelQuantity >= 20 && fuelQuantity <= 25) {
                    totalPrice = totalPrice - (totalPrice * 0.08);
                } else if (fuelQuantity > 25) {
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }

                System.out.printf("%.2f lv.", totalPrice);
                break;
            }
        }
    }
}