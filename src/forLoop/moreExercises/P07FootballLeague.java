package forLoop.moreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stadiumCapacity = Double.parseDouble(scanner.nextLine());
        double fansCount = Double.parseDouble(scanner.nextLine());

        double countSectorA = 0;
        double countSectorB = 0;
        double countSectorV = 0;
        double countSectorG = 0;

        for (int i = 1; i <= fansCount; i++) {

            String sectorType = scanner.nextLine();

            switch (sectorType) {
                case "A":
                    countSectorA++;
                    break;
                case "B":
                    countSectorB++;
                    break;
                case "V":
                    countSectorV++;
                    break;
                default:
                    countSectorG++;
                    break;
            }
        }

        System.out.printf("%.2f%%%n",(countSectorA / fansCount) * 100);
        System.out.printf("%.2f%%%n",(countSectorB / fansCount) * 100);
        System.out.printf("%.2f%%%n",(countSectorV / fansCount) * 100);
        System.out.printf("%.2f%%%n",(countSectorG / fansCount) * 100);
        System.out.printf("%.2f%%", (fansCount / stadiumCapacity) * 100);
    }
}
