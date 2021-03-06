package examPrepare.P02OnlineExam6And7July2019;

import java.util.Scanner;

public class P05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gamesSold = Integer.parseInt(scanner.nextLine());

        int hearthstone = 0;
        int fornite = 0;
        int overwatch = 0;
        int others = 0;

        for (int i = 1; i <= gamesSold; i++) {
            String game = scanner.nextLine();
            if (game.equals("Hearthstone")) {
                hearthstone++;
            } else if (game.equals("Fornite")) {
                fornite++;
            } else if (game.equals("Overwatch")) {
                overwatch++;
            }
            if (!(game.equals("Hearthstone") || game.equals("Fornite") || game.equals("Overwatch"))) {

                others++;
            }
        }
        double hearthstonePercent = hearthstone * 1.0 / gamesSold * 100;
        double fornitePercent = fornite * 1.0 / gamesSold * 100;
        double overwatchPercent = overwatch * 1.0 / gamesSold * 100;
        double othersPercent = others * 1.0 / gamesSold * 100;

        System.out.printf("Hearthstone - %.2f%%%n", hearthstonePercent);
        System.out.printf("Fornite - %.2f%%%n", fornitePercent);
        System.out.printf("Overwatch - %.2f%%%n", overwatchPercent);
        System.out.printf("Others - %.2f%%", othersPercent);
    }
}
