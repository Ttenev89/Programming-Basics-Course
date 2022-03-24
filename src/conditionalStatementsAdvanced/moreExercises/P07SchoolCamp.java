package conditionalStatementsAdvanced.moreExercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int studentCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());


        double sumPerNight = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (group.equals("boys") || group.equals("girls")) {
                    sumPerNight = 9.60;
                } else if (group.equals("mixed")) {
                    sumPerNight = 10;
                    sport = "Ski";
                }
                if (group.equals("boys")) {
                    sport = "Judo";
                } else if (group.equals("girls")) {
                    sport = "Gymnastics";
                }
                break;
            case "Spring":
                if (group.equals("boys") || group.equals("girls")) {
                    sumPerNight = 7.20;
                } else if (group.equals("mixed")) {
                    sumPerNight = 9.50;
                    sport = "Cycling";
                }
                if (group.equals("boys")) {
                    sport = "Tennis";
                } else if (group.equals("girls")) {
                    sport = "Athletics";
                }
                break;
            case "Summer":
                if (group.equals("boys") || group.equals("girls")) {
                    sumPerNight = 15.0;
                } else if (group.equals("mixed")) {
                    sumPerNight = 20.0;
                    sport = "Swimming";
                }
                if (group.equals("boys")) {
                    sport = "Football";
                } else if (group.equals("girls")) {
                    sport = "Volleyball";
                }
                break;
        }

        double totalSum = sumPerNight * nightsCount * studentCount;

        if (studentCount >= 50) {
            totalSum = totalSum - totalSum * 0.50;
        } else if (studentCount >= 20) {
            totalSum = totalSum - totalSum * 0.15;
        } else if (studentCount >= 10) {
            totalSum = totalSum - totalSum * 0.05;
        }

        System.out.printf("%s %.2f lv.", sport, totalSum);
    }
}
