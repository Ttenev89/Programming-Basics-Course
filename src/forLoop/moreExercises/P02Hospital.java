package forLoop.moreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int calculationsPeriod = Integer.parseInt(scanner.nextLine());

        int doctorsCount = 7;

        int treatedPatients = 0;
        int unTreatedPatients = 0;

        for (int i = 1; i <= calculationsPeriod; i++) {

            int patientCount = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && unTreatedPatients > treatedPatients) {
                doctorsCount++;
            }

            if (patientCount > doctorsCount) {
                unTreatedPatients += patientCount - doctorsCount;
                treatedPatients += doctorsCount;
            } else {
                treatedPatients += patientCount;
            }
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", unTreatedPatients);
    }
}
