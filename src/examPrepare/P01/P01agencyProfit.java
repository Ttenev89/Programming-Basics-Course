package examPrepare.P01;

import java.util.Scanner;

public class P01agencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adultTicketCount = Integer.parseInt(scanner.nextLine());
        int youngTicketCount = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;
        double youngTicketPrice = (adultTicketPrice - adultTicketPrice * 0.70) + tax;
        double adultTicket = adultTicketPrice + tax;

        totalPrice = (adultTicket * adultTicketCount) + (youngTicketPrice * youngTicketCount);
        double profit = totalPrice * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, profit);


    }
}
