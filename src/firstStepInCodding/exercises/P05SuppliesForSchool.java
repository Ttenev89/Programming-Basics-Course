package firstStepInCodding.exercises;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double penPrice = pen * 5.80;
        double markerPrice = marker * 7.20;
        double cleanerPrice = cleaner * 1.20;

        double totalPrice = penPrice + markerPrice + cleanerPrice;
        double totalDiscountPrice = totalPrice - (totalPrice * percent) / 100;

        System.out.println(totalDiscountPrice);

    }
}
