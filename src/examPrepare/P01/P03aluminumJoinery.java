package examPrepare.P01;

import java.util.Scanner;

public class P03aluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();

        double price = 0;

        switch (type) {
            case "90X130":
                price = 110;
                if (count > 30 && count <= 60) {
                    price = price - price * 0.05;
                } else if (count > 60) {
                    price = price - price * 0.08;
                }
                break;
            case "100X150":
                price = 140;
                if (count > 40 && count <= 80) {
                    price = price - price * 0.06;
                } else if (count > 80) {
                    price = price - price * 0.10;
                }
                break;
            case "130X180":
                price = 190;
                if (count > 20 && count <= 50) {
                    price = price - price * 0.07;
                } else if (count > 50) {
                    price = price - price * 0.12;
                }
                break;
            case "200X300":
                price = 250;
                if (count > 25 && count <= 50) {
                    price = price - price * 0.09;
                } else if (count > 50) {
                    price = price - price * 0.14;
                }
                break;
        }

        double totalPrice = price * count;

        if (delivery.equals("With delivery")) {
            totalPrice += 60;
        }

        if (count > 99) {
            totalPrice = totalPrice - totalPrice * 0.04;
        }

        if (count <= 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", totalPrice);
        }
    }
}
