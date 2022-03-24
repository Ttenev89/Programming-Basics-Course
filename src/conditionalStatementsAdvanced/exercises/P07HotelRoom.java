package conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50;
                apartPrice = 65;
                if (nightsCount > 7 && nightsCount <= 14) {
                    studioPrice = studioPrice - studioPrice * 0.05;
                } else if (nightsCount > 14) {
                    studioPrice = studioPrice - studioPrice * 0.30;
                }
                if (nightsCount > 14) {
                    apartPrice = apartPrice - apartPrice * 0.10;
                }

                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartPrice = 68.70;
                if (nightsCount > 14) {
                    studioPrice = studioPrice - studioPrice * 0.20;
                }
                if (nightsCount > 14) {
                    apartPrice = apartPrice - apartPrice * 0.10;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartPrice = 77;
                if (nightsCount > 14) {
                    apartPrice = apartPrice - apartPrice * 0.10;
                }
                break;
        }



        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartPrice * nightsCount, studioPrice * nightsCount);
    }
}
