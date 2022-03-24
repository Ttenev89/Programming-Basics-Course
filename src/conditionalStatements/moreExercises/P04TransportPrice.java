package conditionalStatements.moreExercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        if (kilometers < 20){
            double initialFee = 0.7;
            double dailyRate = 0.79;
            double nightRate = 0.9;
            if (dayOrNight.equals("day")){
                System.out.printf("%.2f",initialFee + dailyRate * kilometers);
            } else if (dayOrNight.equals("night")){
                System.out.printf("%.2f",initialFee + nightRate * kilometers);
            }
        } else if (kilometers < 100){
            System.out.printf("%.2f",kilometers * 0.09);
        } else {
            System.out.printf("%.2f", kilometers * 0.06);
        }
    }
}
