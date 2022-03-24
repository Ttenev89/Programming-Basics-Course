package examPrepare.P03Exam6And7April2019;

import java.util.Scanner;

public class P03OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        if (hallType.equals("normal")){
            switch (filmName) {
                case "A Star Is Born":
                    ticketPrice = 7.50;
                    break;
                case "Bohemian Rhapsody":
                    ticketPrice = 7.35;
                    break;
                case "Green Book":
                    ticketPrice = 8.15;
                    break;
                case "The Favourite":
                    ticketPrice = 8.75;
                    break;
            }
        } else if (hallType.equals("luxury")) {
            switch (filmName) {
                case "A Star Is Born":
                    ticketPrice = 10.50;
                    break;
                case "Bohemian Rhapsody":
                    ticketPrice = 9.45;
                    break;
                case "Green Book":
                    ticketPrice = 10.25;
                    break;
                case "The Favourite":
                    ticketPrice = 11.55;
                    break;
            }
        } else {
            switch (filmName) {
                case "A Star Is Born":
                    ticketPrice = 13.50;
                    break;
                case "Bohemian Rhapsody":
                    ticketPrice = 12.75;
                    break;
                case "Green Book":
                    ticketPrice = 13.25;
                    break;
                case "The Favourite":
                    ticketPrice = 13.95;
                    break;
            }
        }

        System.out.printf("%s -> %.2f lv.", filmName, ticketsCount * ticketPrice);
    }
}
