package firstStepInCodding.exercises;

import java.util.Scanner;

public class P04VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysForRead = Integer.parseInt(scanner.nextLine());

        int timeForReading = pagesCount / pagesPerHour;
        int timeForDay = timeForReading / daysForRead;

        System.out.println(timeForDay);
    }
}
