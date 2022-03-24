package nestedLoops.moreExercises;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char begin = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        char miss = scanner.next().charAt(0);

        int count = 0;

        for (char i = begin; i <= end; i++) {
            for (char j = begin; j <= end; j++) {
                for (char k = begin; k <= end; k++) {

                    if (i != miss && j != miss && k != miss) {

                        count++;
                        System.out.printf("%s%s%s ", i, j, k);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
