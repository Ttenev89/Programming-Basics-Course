package examPrepare.P03Exam6And7April2019;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        double maxRating = Double.MIN_VALUE;
        String maxFilm = "";

        double minRating = Double.MAX_VALUE;
        String minFilm = "";

        double sum = 0;

        for (int i = 1; i <=count ; i++) {
            String film = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            if (rating > maxRating) {
                maxRating = rating;
                maxFilm = film;
            }
            if (rating < minRating) {
                minRating = rating;
                minFilm = film;
            }

            sum += rating;
        }

        System.out.printf("%s is with highest rating: %.1f%n", maxFilm, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", minFilm, minRating);
        System.out.printf("Average rating: %.1f", sum / count);
    }
}
