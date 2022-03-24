package conditionalStatements.exercises;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondPerOneMeter = Double.parseDouble(scanner.nextLine());

        double time = distance * secondPerOneMeter;

        double delay = Math.floor(distance / 15) * 12.5;

        double totalTime = time + delay;

        if (totalTime < recordSec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordSec);
        }



    }
}
