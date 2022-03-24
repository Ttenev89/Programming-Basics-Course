package examPrepare.P04Exam2And3May2019;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double littersFuel = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();


        double fuelPrice = 2.10;
        double guidePrice = 100;
        double needMoney = littersFuel * fuelPrice + guidePrice;

        if (dayOfWeek.equals("Saturday")) {
            needMoney = needMoney - needMoney * 0.10;
        } else if (dayOfWeek.equals("Sunday")) {
            needMoney = needMoney - needMoney * 0.20;
        }

        if (budget > needMoney) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - needMoney);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", needMoney - budget);
        }
    }
}
