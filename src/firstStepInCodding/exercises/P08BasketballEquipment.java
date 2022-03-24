package firstStepInCodding.exercises;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearFee = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = yearFee - (yearFee * 0.4);
        double dressPrice = sneakersPrice - (sneakersPrice * 0.2);
        double ballPrice = dressPrice / 4;
        double accessoriesPrice = ballPrice / 5;

        double totalPrice = yearFee + sneakersPrice + dressPrice + ballPrice + accessoriesPrice;

        System.out.println(totalPrice);


    }
}
