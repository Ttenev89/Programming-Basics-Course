package nestedLoops.moreExercises;

import java.util.Scanner;

public class P04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());

        for (int n1 = startNum; n1 <= endNum; n1++) {
            for (int n2 = startNum; n2 <= endNum; n2++) {
                for (int n3 = startNum; n3 <= endNum; n3++) {
                    for (int n4 = startNum; n4 <= endNum; n4++) {

                        boolean isEvenFirst = n1 % 2 == 0;
                        boolean isOddFirst = n1 % 2 != 0;
                        boolean isEvenFour = n4 % 2 == 0;
                        boolean isOddFour = n4 % 2 != 0;
                        boolean isFirstBigger = n1 > n4;
                        boolean evenSum = (n2 + n3) % 2 == 0;

                        if (((isEvenFirst && isOddFour) || (isOddFirst && isEvenFour)) && (isFirstBigger && evenSum)) {

                            System.out.printf("%d%d%d%d ", n1, n2, n3, n4);

                        }
                    }
                }
            }
        }
    }
}
