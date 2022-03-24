package conditionalStatements.moreExercises;

import java.util.Scanner;

public class P07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoliasCount = Integer.parseInt(scanner.nextLine());
        int hyacinthCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int cactusCount = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalSum = magnoliasCount * 3.25 + hyacinthCount * 4 + rosesCount * 3.5 + cactusCount * 8;
        double sumAfterTax = totalSum - (totalSum * 0.05);

        if (sumAfterTax >= giftPrice){
            System.out.printf("She is left with %.0f leva.", Math.floor(sumAfterTax - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - sumAfterTax));
        }
    }
}
