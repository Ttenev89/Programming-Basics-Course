package conditionalStatements.exercises;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int serialLength = Integer.parseInt(scanner.nextLine());
        int lengthOfRest = Integer.parseInt(scanner.nextLine());

        double lunchTime = lengthOfRest / 8.00;
        double restTime = lengthOfRest / 4.00 ;

        double totalTime = lengthOfRest - lunchTime - restTime;

        if (totalTime >= serialLength){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(totalTime - serialLength));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, Math.ceil(serialLength - totalTime));
        }
    }
}
