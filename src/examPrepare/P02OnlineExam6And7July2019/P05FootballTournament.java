package examPrepare.P02OnlineExam6And7July2019;

import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int matchPlayed = Integer.parseInt(scanner.nextLine());

        int W = 0;
        int D = 0;
        int L = 0;
        int points = 0;

        for (int i = 1; i <= matchPlayed; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    W++;
                    points += 3;
                    break;
                case "D":
                    D++;
                    points += 1;
                    break;
                case "L":
                    L++;
                    break;
            }


        }
        if (matchPlayed <= 0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);

        } else {
            System.out.printf("%s has won %d points during this season.%n", teamName, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n## D: %d%n## L: %d%n", W, D, L);
            System.out.printf("Win rate: %.2f%%", W * 1.00 / matchPlayed * 100);

        }
    }
}
