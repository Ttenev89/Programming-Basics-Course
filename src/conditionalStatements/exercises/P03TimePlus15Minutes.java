package conditionalStatements.exercises;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMin = hours * 60 + minutes + 15;

        int newHours = totalMin / 60;
        int newMinutes = totalMin % 60;

        if (newHours == 24){
            newHours = 0;
        }

        if (newMinutes < 10){
            System.out.printf("%d:0%d", newHours, newMinutes);
        } else{
            System.out.printf("%d:%d", newHours, newMinutes);
        }
    }
}
