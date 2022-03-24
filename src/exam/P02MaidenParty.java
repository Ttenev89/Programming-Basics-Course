package exam;

import java.util.Scanner;

public class P02MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int messageCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int keyHoldersCount = Integer.parseInt(scanner.nextLine());
        int caricaturesCount = Integer.parseInt(scanner.nextLine());
        int surpriseCount = Integer.parseInt(scanner.nextLine());

        double sum = messageCount * 0.60 + rosesCount * 7.20 + keyHoldersCount * 3.60
                + caricaturesCount * 18.20 + surpriseCount * 22;

        int articleCount = messageCount + rosesCount + keyHoldersCount + caricaturesCount + surpriseCount;

        if (articleCount >= 25) {
            sum -= sum * 0.35;
        }

        double hosting =  sum * 0.10;

        double finalProfit = sum - hosting;

        if (finalProfit >= partyPrice) {
            System.out.printf("Yes! %.2f lv left.", finalProfit - partyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(finalProfit - partyPrice));
        }

    }
}
