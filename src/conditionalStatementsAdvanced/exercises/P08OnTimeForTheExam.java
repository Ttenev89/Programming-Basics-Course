package conditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMin = Integer.parseInt(scanner.nextLine());

        int examAllMin = examHour * 60 + examMinute;
        int arriveAllMin = arriveHour * 60 + arriveMin;

        int diff = Math.abs(examAllMin - arriveAllMin);
        int diffHour = diff / 60;
        int diffMin = diff % 60;
        if (examAllMin < arriveAllMin) {
            System.out.println("Late");
            if (diffHour == 0) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%02d hours after the start", diffHour, diffMin);
            }

        } else if (examAllMin == arriveAllMin || diff <= 30) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", diffMin);
            }
        } else {
            System.out.println("Early");
            if (diffHour == 0) {
                System.out.printf("%d minutes before the start", diffMin);
            } else {
                System.out.printf("%d:%02d hours before the start", diffHour, diffMin);

            }
        }
    }
}
