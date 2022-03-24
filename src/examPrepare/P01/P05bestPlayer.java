package examPrepare.P01;

import java.util.Scanner;

public class P05bestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int bestResult = 0;
        String bestPlayer = "";

        while (!input.equals("END")) {
            int goalsScores = Integer.parseInt(scanner.nextLine());

            if (goalsScores > bestResult) {
                bestResult = goalsScores;
                bestPlayer = input;
            }

            if (bestResult >= 10) {
                break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);

        if (bestResult >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestResult);
        } else {
            System.out.printf("He has scored %d goals.", bestResult);
        }



    }
}
