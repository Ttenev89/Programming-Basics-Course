package conditionalStatements.moreExercises;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipe1Volume = pipe1 * hours;
        double pipe2Volume = pipe2 * hours;
        double volumePerHours = pipe1Volume + pipe2Volume;

        double volumePercent = volumePerHours / volume * 100;
        double pipe1Percent = pipe1Volume / volumePerHours * 100;
        double pipe2Percent = pipe2Volume / volumePerHours * 100;
        double overflows = volumePerHours - volume;

        if (volumePerHours <= volume){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", volumePercent, pipe1Percent, pipe2Percent);
        } else if(volumePerHours > volume){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, overflows);
        }



    }
}
