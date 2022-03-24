package conditionalStatements.moreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int restDaysCount = Integer.parseInt(scanner.nextLine());

        double playTime = 30000;

        double playingMinutesInRestDays = restDaysCount * 127;
        double playingMinutesInWorkDays = (365 - restDaysCount) * 63;

        double playingMinutes = playingMinutesInRestDays + playingMinutesInWorkDays;

        double residue = 0;

        if (playTime > playingMinutes){
            residue = playTime - playingMinutes;
            double hours = residue / 60;
            double minutes = residue % 60;
            System.out.printf("Tom sleeps well\n%.0f hours and %.0f minutes less for play", Math.floor(hours), minutes);
        } else {
            residue = playingMinutes - playTime;
            double hours = residue / 60;
            double minutes = residue % 60;
            System.out.printf("Tom will run away\n%.0f hours and %.0f minutes more for play", Math.floor(hours), minutes);
        }

    }
}
