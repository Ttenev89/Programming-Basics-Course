package conditionalStatements.moreExercises;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int employeeExtraWork = Integer.parseInt(scanner.nextLine());



        double workTime = Math.floor((days - days * 0.1) * 8 + (employeeExtraWork * 2) * days);

        if (workTime >= hours){
            System.out.printf("Yes!%.0f hours left.", Math.floor(workTime - hours));
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", Math.floor(hours - workTime));
        }

    }
}
