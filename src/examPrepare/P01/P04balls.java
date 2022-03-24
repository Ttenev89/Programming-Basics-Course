package examPrepare.P01;

import java.util.Scanner;

public class P04balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double points = 0;
        int diffColor = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;

        for (int i = 1; i <= n; i++) {
            String ballsColor = scanner.nextLine();

            switch (ballsColor) {
                case "red":
                    points += 5;
                    redBalls++;
                    break;
                case "orange":
                    points += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    points += 15;
                    yellowBalls++;
                    break;
                case "white":
                    points += 20;
                    whiteBalls++;
                    break;
                case "black":
                    points = Math.floor(points / 2);
                    blackBalls++;
                    break;
            }

            if (!ballsColor.equals("red") && !ballsColor.equals("orange") && !ballsColor.equals("yellow")
                    && !ballsColor.equals("white") && !ballsColor.equals("black")) {
                diffColor++;
            }

        }
        System.out.printf("Total points: %.0f%n", points);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", diffColor);
        System.out.printf("Divides from black balls: %d", blackBalls);
    }
}
