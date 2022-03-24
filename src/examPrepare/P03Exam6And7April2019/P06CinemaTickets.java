package examPrepare.P03Exam6And7April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();

        int student = 0;
        int standard = 0;
        int kid = 0;

        while (!film.equals("Finish")) {
            int places = Integer.parseInt(scanner.nextLine());
            int people = 0;
            label:

            for (int i = 0; i < places; i++) {

                String type = scanner.nextLine();

                switch (type) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                    case "End":
                        break label;
                }

                people++;
            }

            System.out.printf("%s - %.2f%% full.%n", film, people * 1.00 / places * 100);

            film = scanner.nextLine();
        }

        int totalTickets = student + standard + kid;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", student * 1.00 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.00 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kid * 1.00 / totalTickets * 100);

    }
}
