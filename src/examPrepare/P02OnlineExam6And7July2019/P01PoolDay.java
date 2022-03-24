package examPrepare.P02OnlineExam6And7July2019;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double bedPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double entrePrice = peopleCount * tax;
        double totalBedPrice = Math.ceil(peopleCount * 0.75) * bedPrice;
        double totalUmbrellaPrice = Math.ceil(peopleCount * 0.50) * umbrellaPrice;

        double totalPrice = entrePrice + totalBedPrice + totalUmbrellaPrice;

        System.out.printf("%.2f lv.", totalPrice);
    }
}
