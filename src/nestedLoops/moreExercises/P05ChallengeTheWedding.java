package nestedLoops.moreExercises;

import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menCount = Integer.parseInt(scanner.nextLine());
        int womanCount = Integer.parseInt(scanner.nextLine());
        int tablesCount = Integer.parseInt(scanner.nextLine());

        int maxCount = 0;


            for (int n1 = 1; n1 <= menCount; n1++) {
                for (int n2 = 1; n2 <= womanCount; n2++) {
                    maxCount++;

                    System.out.printf("(%d <-> %d) ", n1, n2);

                    if (maxCount == tablesCount) {
                        return;
                    }
                }

            }

        }
    }



