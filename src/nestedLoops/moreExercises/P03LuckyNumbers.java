package nestedLoops.moreExercises;

import java.util.Scanner;

public class P03LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int n1 = 1; n1 <= 9; n1++) {
            for (int n2 = 1; n2 <= 9; n2++) {
                for (int n3 = 1; n3 <= 9; n3++) {
                    for (int n4 = 1; n4 <= 9; n4++) {

                        boolean luckyNumber = (n1 + n2 == n3 + n4) && (n % (n1 + n2) == 0);

                        if (luckyNumber){
                            System.out.printf("%d%d%d%d ", n1, n2, n3, n4);
                        }
                    }
                }
            }
        }
    }
}
